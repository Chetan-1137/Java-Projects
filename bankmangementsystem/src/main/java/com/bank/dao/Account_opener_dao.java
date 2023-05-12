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

import com.bank.entity.Account_opener;

@Repository
public class Account_opener_dao {
	@Autowired
	private SessionFactory sf;

	public String insert_Account_opener_detail(Account_opener opener) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(opener);
		transaction.commit();
		return "insert Account_opener_detail";
	}

	public Account_opener get_Account_opener_detail(int id) {
		Session session = sf.openSession();
		Account_opener opener = session.get(Account_opener.class, id);
		return opener;
	}

	public String update_Account_opener_detail(Account_opener opener) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(opener);
		transaction.commit();
		return "updated Account_opener_detail ";

	}

	public String delete_Account_opener_detail(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Account_opener delete = session.get(Account_opener.class, id);
		session.delete(delete);
		transaction.commit();
		return "delete_Account_opener_detail";
	}

	public List<Account_opener> get_detail_all_Account_openers() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		List<Account_opener> detail = criteria.list();
		return detail;
	}

	public List<Account_opener> get_Account_opener_detail_start_with_name_s() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Account_opener> detail = criteria.list();

		return detail;
	}

	public List<Account_opener> get_Account_opener_detail_who_salary_1_lac() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.add(Restrictions.like("name", "c%"));
		List<Account_opener> list = criteria.list();
		return list;

	}

	public List<Account_opener> get_Account_opener_maxisum_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.max("salary"));
		List<Account_opener> detail = criteria.list();
		return detail;

	}

	public List<Account_opener> get_Account_opener_detail_all_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.count("name"));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_branch_name_start_with_() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.add(Restrictions.between("age", 30, 50));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.add(Restrictions.ge("Salary", 10000));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_salary_minimum() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.min("salary"));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_list() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.groupProperty("name"));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_list_property() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.property("age"));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_list_avg() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.avg("age"));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_list_name() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_list_name_detail() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Account_opener");
		List<Account_opener> list = query.list();
		return list;
	}

	public String get_Account_opener_detail_list_name_delete(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from Account_opener u where u.id=:id");
		query.setParameter("id", id);
		int a = query.executeUpdate();
		transaction.commit();
		return "delete detail Account_opener";
	}

	public List<Account_opener> get_Account_opener_detail_list_name_in() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.add(Restrictions.in("name", "Chetan patil"));
		List<Account_opener> list = criteria.list();
		return list;
	}

	public List<Account_opener> get_Account_opener_detail_list_name_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Account_opener.class);
		criteria.setProjection(Projections.rowCount());
		List<Account_opener> list = criteria.list();
		return list;
	}

}
