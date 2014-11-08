package com.crm.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crm.model.Lead_bean;
import com.crm.service.LeadService;

@RestController
public class LeadController {
	private LeadService leadService;

	@Autowired(required = true)
	@Qualifier(value = "leadService")
	public void setPersonService(LeadService cs) {
		this.leadService = cs;
	}
	@RequestMapping(value="/lead_list",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<Lead_bean> getLead(@PathVariable String limit) {	
		 System.out.println(limit);
		 List<Lead_bean> lists=this.leadService.getLeadlist();
		  return lists;
		
		 }	
}
