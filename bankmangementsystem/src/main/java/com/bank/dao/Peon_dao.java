package com.bank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Peon;

@Repository
public class Peon_dao {
	@Autowired
    SessionFactory sf;
	public String  insert_detail_peon(Peon peon) {
		Session session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(peon);
		transaction.commit();
		
		return "insert detail peon";
	}
	public String update_detail_peon(Peon peon) {
		Session session=sf.openSession();
		Transaction transaction= session.beginTransaction();
		session.update(peon);
		transaction.commit();
		
		return "update detail peon";
	}
	public List<Peon>  get_detail_peon() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Peon.class);
		List<Peon>list = criteria.list();
		return list;
		
	}
	public Peon get_detail_peon(int id) {
		 Session session=sf.openSession();
		 Peon peon=session.get(Peon.class, id);
		 return peon;
		
	}
	public String delete_detail_peon(int id) {
	    Session session=sf.openSession();
	    Transaction transaction= session.beginTransaction();
	    Peon peon=session.get(Peon.class, id);
	    session.delete(peon);
	    transaction.commit();
	    
	    return "detail delete peon";
		
	}

}
