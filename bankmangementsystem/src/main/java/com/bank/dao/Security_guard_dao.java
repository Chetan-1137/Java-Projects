package com.bank.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Security_guard;
@Repository
public class Security_guard_dao {
@Autowired
    private SessionFactory sf;
	public String insert_detail_security_gaurd(Security_guard guard) {
	    Session session=sf.openSession();
	    Transaction transaction=session.beginTransaction();
	    session.save(guard);
	    transaction.commit();
	    
		return "insert security gaurd  detail";
	}
	public String update_detail_security_gaurd(Security_guard guard) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(guard);
		transaction.commit();
		return "update_detail_security_gaurd";
		
	}
	public List<Security_guard> get_detail_security_gaurd() {
		Session session=sf.openSession();
		Criteria criteria= session.createCriteria(Security_guard.class);
		List<Security_guard>list= criteria.list();
		return list;
		 
	}
	public Security_guard get_detail_security_gaurd(int id) {
		Session session=sf.openSession();
		Security_guard guard= session.get(Security_guard.class, id);
		return guard;
		
	}
	public String delete_detail_security_gaurd(int id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Security_guard guard=session.get(Security_guard.class, id);
		session.delete(guard);
		transaction.commit();
		
		return "delete detail Security gaurd";
		
	}
	
	}
	


