package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.crm.dao.LeadDao;
import com.crm.model.Lead_bean;
@Repository
public class LeadDaoimpl  implements LeadDao {
	private static final Logger logger = LoggerFactory.getLogger(LeadDao.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Lead_bean> getLeadlist() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q=session.createQuery("from Lead_bean");
		q.setFirstResult(3).setMaxResults(10);
		List<Lead_bean> leadList =q.list();
		
		for (Lead_bean c : leadList) {
			logger.info("Lead List::" + c);
		}
		return leadList;
	}



}
