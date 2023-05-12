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

import com.bank.entity.Clerk;

@Repository
public class Clerk_dao {
	@Autowired
	private SessionFactory sf;

	public String insert_detail_clerk(Clerk clerk) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(clerk);
		transaction.commit();
		return "clerk detail inseted";
	}

	public String update_detail_clerk(Clerk clerk) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(clerk);
		transaction.commit();
		return "update clerk detail";
		
	}

	public List<Clerk> get_detail_clerk() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		List<Clerk> list = criteria.list();
		return list;
		
	}

	public Clerk get_detail_clerk1(int id) {
		Session session = sf.openSession();
		Clerk clerk = session.get(Clerk.class, id);
		return clerk;
	}

	public String delete_clerk_detail(int id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Clerk clerk=session.get(Clerk.class, id);
		session.delete(clerk);
		transaction.commit();
		
		return "delete clerk detail";
		
	}
	public List<Clerk> get_clerk_detail_start_with_name_s() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Clerk> detail = criteria.list();

		return detail;
	}

	public List<Clerk> get_clerk_detail_who_salary_1_lac() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.add(Restrictions.like("name", "c%"));
		List<Clerk> list = criteria.list();
		return list;

	}

	public List<Clerk> get_clerk_detail_maxisum_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.max("salary"));
		List<Clerk> detail = criteria.list();
		return detail;

	}

	public List<Clerk> get_clerk_detail_all_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.count("name"));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_branch_name_start_with_() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.add(Restrictions.between("age", 10, 50));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.add(Restrictions.ge("Salary", 10000));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_salary_minimum() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.min("salary"));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_list() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.groupProperty("name"));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_list_property() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.property("age"));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_list_avg() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.avg("age"));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_list_name() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_list_name_detail() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Clerk");
		List<Clerk> list = query.list();
		return list;
	}

	public String get_clerk_detail_list_name_delete(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from Clerk u where u.id=:id");
		query.setParameter("id", id);
		int a = query.executeUpdate();
		transaction.commit();
		return "delete detail Cashier";
	}

	public List<Clerk> get_clerk_detail_list_name_in() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.add(Restrictions.in("name", "Chetan patil"));
		List<Clerk> list = criteria.list();
		return list;
	}

	public List<Clerk> get_clerk_detail_list_name_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Clerk.class);
		criteria.setProjection(Projections.rowCount());
		List<Clerk> list = criteria.list();
        return list;
	}


}



