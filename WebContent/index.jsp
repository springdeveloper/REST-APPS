<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJS Task Manager</title>

<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<script data-require="angular.js@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular.js"></script>
  <script data-require="angular-animate@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular-animate.js"></script>
<script>
var taskManagerModule = angular.module('taskManagerApp', ['ngAnimate']);

taskManagerModule.controller('taskManagerController', function ($scope,$http) {
	
	var urlll="http://localhost:8080/REST-APPS";
	
	
	
	$http.get(urlll+'/lead_list').
	success(function(data) {
		
        $scope.tasks1 = data;
        console.log("ffs"+$scope.tasks1);
	
});
	

	 $http({

	        method: "GET",
	        url:urlll+"/lead_list",

	        params: {
	            relation:'variations',
	            limit:1
	        }

	    }).success(function (data) {
	        $scope.product=data;
	        console.log(JSON.stringify(data))
    
	        
	       
	    });
	
	
	
	
	
	
	
	
	
	//add a new task
	$scope.addTask = function addTask() {
		if($scope.taskName=="" || $scope.taskDesc=="" || $scope.taskPriority == "" || $scope.taskStatus == ""){
			alert("Insufficient Data! Please provide values for task name, description, priortiy and status");
		}
		else{
		 $http.post(urlBase + '/tasks/insert/' +$scope.taskName+'/'+$scope.taskDesc+'/'+$scope.taskPriority+'/'+$scope.taskStatus).
		  success(function(data) {
			 alert("Task added");
			 $scope.tasks = data;	
			 $scope.taskName="";
			 $scope.taskDesc="";
			 $scope.taskPriority="";
			 $scope.taskStatus="";
			 $scope.toggle='!toggle';			 
		    });
		}
	};
		
	// toggle selection for a given task by task id
	  $scope.toggleSelection = function toggleSelection(taskId) {
	    var idx = $scope.selection.indexOf(taskId);

	    // is currently selected
	    if (idx > -1) {
	      $http.post(urlBase + '/tasks/' +taskId+'/ACTIVE').
		  success(function(data) {
			 alert("Task unmarked");
			 $scope.tasks = data;		       
		    });
	      $scope.selection.splice(idx, 1);
	    }

	    // is newly selected
	    else {
	      $http.post(urlBase + '/tasks/' +taskId+'/COMPLETED').
		  success(function(data) {
			 alert("Task marked completed");
			 $scope.tasks = data;
		    });
	      $scope.selection.push(taskId);
	    }
	  };
	  
	
	// Archive Completed Tasks
	  $scope.archiveTasks = function archiveTasks() {
		  $http.post(urlBase + '/tasks/archive/' + $scope.selection).
		  success(function(data) {
			  $scope.tasks = data;
		       alert("Successfully Archived");
		    });
	  };
	
});

//Angularjs Directive for confirm dialog box
taskManagerModule.directive('ngConfirmClick', [
	function(){
         return {
             link: function (scope, element, attr) {
                 var msg = attr.ngConfirmClick || "Are you sure?";
                 var clickAction = attr.confirmedClick;
                 element.bind('click',function (event) {
                     if ( window.confirm(msg) ) {
                         scope.$eval(clickAction);
                     }
                 });
             }
         };
 }]);

</script>
</head>
<body>

<div ng-controller="taskManagerController">
<div class="panel-body">
<table border="1">
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr ng-repeat="task in tasks1">
<td>{{task.id}}</td>
<td>{{task.first_name}}</td>
<td>{{task.last_name}}</td>
<td>{{task.created_date}}</td>
</tr>
</table>

			
	</div>
</div>
</body>
</html>