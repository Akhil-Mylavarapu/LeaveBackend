package com.niit.leave.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.leave.dao.LeaveDAO;
import com.niit.leave.domain.Leave;

@Repository(value="leaveDAO")
public class LeaveDAOImpl implements LeaveDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	
	 public LeaveDAOImpl(SessionFactory sessionFactory)
	
	{
		
		this.sessionFactory=sessionFactory;
	}
	
	
@Transactional
	public boolean save(Leave leave) {
	
		try {
			sessionFactory.getCurrentSession().save(leave);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
}
