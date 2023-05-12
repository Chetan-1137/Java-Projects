package com.bank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Cashier;

@Repository
public class Cashier_dao {
	@Autowired
	private SessionFactory sf;

	public String insert_Cashier_detail(Cashier detail) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(detail);
		transaction.commit();
		return "insert Cashier detail";
	}

	public String update_Cashier_detail(Cashier detail) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(detail);
		transaction.commit();
		return"update Cashier detail";
	}

	public String delete_Cashier_detail(int id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Cashier detail=session.get(Cashier.class, id);
		session.delete(detail);
		transaction.commit();
		return"delete cashier detail";
	}
	public List<Cashier> get_detail_all_Cashiers() {
		Session session=sf.openSession();
		Criteria criteria= session.createCriteria(Cashier.class);
	    List<Cashier>detail=criteria.list();
	    return detail;
		
	}

	public Cashier get_detail_Cashier(int id) {
		Session session=sf.openSession();
		Cashier detail=session.get(Cashier.class, id);
		 return detail;
	}
	public List<Cashier> get_Cashier_detail_start_with_name_s() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Cashier> detail = criteria.list();

		return detail;
	}

	public List<Cashier> get_Cashier_detail_who_salary_1_lac() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.add(Restrictions.like("name", "c%"));
		List<Cashier> list = criteria.list();
		return list;

	}

	public List<Cashier> get_Cashier_detail_maxisum_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.max("salary"));
		List<Cashier> detail = criteria.list();
		return detail;

	}

	public List<Cashier> get_Cashier_detail_all_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.count("name"));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_branch_name_start_with_() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.add(Restrictions.between("age", 10, 50));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.add(Restrictions.ge("Salary", 10000));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_salary_minimum() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.min("salary"));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_list() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.groupProperty("name"));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_list_property() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.property("age"));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_list_avg() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.avg("age"));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_list_name() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_list_name_detail() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Cashier");
		List<Cashier> list = query.list();
		return list;
	}

	public String get_Cashier_detail_list_name_delete(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from Cashier u where u.id=:id");
		query.setParameter("id", id);
		int a = query.executeUpdate();
		transaction.commit();
		return "delete detail Cashier";
	}

	public List<Cashier> get_Cashier_detail_list_name_in() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.add(Restrictions.in("name", "Chetan patil"));
		List<Cashier> list = criteria.list();
		return list;
	}

	public List<Cashier> get_Cashier_detail_list_name_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Cashier.class);
		criteria.setProjection(Projections.rowCount());
		List<Cashier> list = criteria.list();
        return list;
	}


}
