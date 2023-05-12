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

import com.bank.entity.Bank_manager;

@Repository
public class Manager_dao {
	@Autowired
	private SessionFactory sf;

	public List<Bank_manager> getAlldetail_manager() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public String insert_manager_detail(Bank_manager manager) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(manager);
		transaction.commit();
		return "bank manager detail inserted ";
	}

	public String update_manager_detail(Bank_manager manager) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(manager);
		transaction.commit();
		return "bank manager detail update";
	}

	public String delete_manager_detail(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Bank_manager detail = session.get(Bank_manager.class, id);
		session.delete(detail);
		transaction.commit();
		return "delete manager update";
	}

	public Bank_manager get_detail_manager(int id) {
		Session session = sf.openSession();
		Bank_manager detail = session.get(Bank_manager.class, id);
		return detail;
	}

	public List<Bank_manager> get_Bank_manager_detail_start_with_name_s() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Bank_manager> detail = criteria.list();

		return detail;
	}

	public List<Bank_manager> get_Bank_manager_detail_who_salary_1_lac() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.add(Restrictions.like("name", "c%"));
		List<Bank_manager> list = criteria.list();
		return list;

	}

	public List<Bank_manager> get_Bank_manager_detail_maxisum_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.max("salary"));
		List<Bank_manager> detail = criteria.list();
		return detail;

	}

	public List<Bank_manager> get_Bank_manager_detail_all_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.count("name"));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_branch_name_start_with_() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.add(Restrictions.between("age", 30, 50));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.add(Restrictions.ge("Salary", 10000));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_salary_minimum() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.min("salary"));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_list() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.groupProperty("name"));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_list_property() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.property("age"));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_list_avg() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.avg("age"));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_list_name() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_list_name_detail() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Bank_manager");
		List<Bank_manager> list = query.list();
		return list;
	}

	public String get_Bank_manager_detail_list_name_delete(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from Bank_manager u where u.id=:id");
		query.setParameter("id", id);
		int a = query.executeUpdate();
		transaction.commit();
		return "delete detail Bank manager";
	}

	public List<Bank_manager> get_Bank_manager_detail_list_name_in() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.add(Restrictions.in("name", "Chetan patil"));
		List<Bank_manager> list = criteria.list();
		return list;
	}

	public List<Bank_manager> get_Bank_manager_detail_list_name_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Bank_manager.class);
		criteria.setProjection(Projections.rowCount());
		List<Bank_manager> list = criteria.list();
        return list;
	}

}