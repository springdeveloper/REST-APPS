package com.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.LeadDao;
import com.crm.model.Lead_bean;
import com.crm.service.LeadService;

public class LeadServiceimpl implements LeadService{
	private LeadDao leadDAO;

	
	public void setLeadDAO(LeadDao leadDAO) {
		this.leadDAO = leadDAO;
	}


	@Override
	@Transactional
	public List<Lead_bean> getLeadlist() {
		
		return leadDAO.getLeadlist();
	}

}
