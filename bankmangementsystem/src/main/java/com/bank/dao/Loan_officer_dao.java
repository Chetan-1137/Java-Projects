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

import com.bank.entity.Loan_officer;

@Repository
public class Loan_officer_dao {
	@Autowired
	private SessionFactory sf;

	public String insert_detail_loan_officer(Loan_officer officer) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(officer);
		transaction.commit();

		return "insert_detail_loan_officer";
	}

	public String update_detail_loan_officer(Loan_officer officer) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(officer);
		transaction.commit();

		return "update_detail_loan_officer";
	}

	public List<Loan_officer> get_loan_officer_detail() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		List<Loan_officer> list = criteria.list();

		return list;

	}

	public Loan_officer get_loan_officer_detail(int id) {
        Session session=sf.openSession();
        Loan_officer officer=session.get(Loan_officer.class, id);
        
        return officer;
	}
	
	public String delete_detail_loan_officer( int id) {
	    Session session=sf.openSession();
	    Loan_officer officer=session.get(Loan_officer.class, id);
	    session.delete(officer);
	    
	    return "delete_detail_loan_officer";
	}
	
	public List<Loan_officer> get_loan_officer_detail_start_with_name_s() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Loan_officer> detail = criteria.list();

		return detail;
	}

	public List<Loan_officer> get_loan_officer_detail_who_salary_1_lac() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.add(Restrictions.like("name", "c%"));
		List<Loan_officer> list = criteria.list();
		return list;

	}

	public List<Loan_officer> get_loan_officer_detail_maxisum_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.max("salary"));
		List<Loan_officer> detail = criteria.list();
		return detail;

	}

	public List<Loan_officer> get_loan_officer_detail_all_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.count("name"));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_branch_name_start_with_() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.add(Restrictions.between("age", 30, 50));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officerr_detail_salary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.add(Restrictions.ge("Salary", 10000));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_salary_minimum() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.min("salary"));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_list() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.groupProperty("name"));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_list_property() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.property("age"));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_list_avg() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.avg("age"));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_list_name() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_list_name_detail() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Bank_manager");
		List<Loan_officer> list = query.list();
		return list;
	}

	public String get_loan_officer_detail_list_name_delete(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from Loan_officer u where u.id=:id");
		query.setParameter("id", id);
		int a = query.executeUpdate();
		transaction.commit();
		return "delete detail Loan_officer";
	}

	public List<Loan_officer> get_loan_officer_detail_list_name_in() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.add(Restrictions.in("name", "Chetan patil"));
		List<Loan_officer> list = criteria.list();
		return list;
	}

	public List<Loan_officer> get_loan_officer_detail_list_name_count() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Loan_officer.class);
		criteria.setProjection(Projections.rowCount());
		List<Loan_officer> list = criteria.list();
        return list;
	}

}


	
