package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Loan_officer_dao;
import com.bank.entity.Loan_officer;

@Service
public class Loan_officer_service {
	@Autowired
	private Loan_officer_dao ld;

	public String insert_detail_loan_officer(Loan_officer officer) {
		return ld.insert_detail_loan_officer(officer);
	}

	public String update_detail_loan_officer(Loan_officer officer) {
		return ld.update_detail_loan_officer(officer);

	}

	public List<Loan_officer> get_loan_officer_detail() {
		return ld.get_loan_officer_detail();
	}

	public Loan_officer get_loan_officer_detail(int id) {
        return ld. get_loan_officer_detail(id);
	}

	public String delete_detail_loan_officer(int id) {
		return ld.delete_detail_loan_officer(id);
	}
	
	public List<Loan_officer> get_loan_officer_detail_start_with_name_s() {
		return ld.get_loan_officer_detail_start_with_name_s();
	}

	public List<Loan_officer> get_loan_officer_detail_who_salary_1_lac() {
		List<Loan_officer> list = ld.get_loan_officer_detail_who_salary_1_lac();
		List<Loan_officer> detail = new ArrayList<>();
		for (Loan_officer officer : list) {
			if (officer.getSalary() > 10000) {
				detail.add(officer);
			} else {
				return null;

			}
		}
		return detail;

	}

	public List<Loan_officer> get_loan_officer_detail_maxisum_salary() {
		return ld.get_loan_officer_detail_maxisum_salary();
	}

	public List<Loan_officer> get_loan_officer_detail_all_count() {
		return ld.get_loan_officer_detail_all_count();
	}

	public List<Loan_officer> get_loan_officer_detail_branch_name_start_with() {
		List<Loan_officer> list = ld.get_loan_officer_detail_branch_name_start_with_();
		List<Loan_officer> detail = new ArrayList<>();
		for (Loan_officer officer : list) {
			if (officer.getBranch_name().equals("chalisgaon")) {

				detail.add(officer);

				return detail;

			} else {

				return null;
			}

		}

		return null;
	}

	public List<Loan_officer> get_loan_officer_detail_salary() {
		return ld.get_loan_officer_detail_maxisum_salary();

	}

	public List<Loan_officer> get_loan_officer_detail_salary_minimum() {
		return ld.get_loan_officer_detail_salary_minimum();
	}

	public List<Loan_officer> get_loan_officer_detail_list() {

		return ld.get_loan_officer_detail_list();
	}

	public List<Loan_officer> get_loan_officer_detail_list_property() {
		return ld.get_loan_officer_detail_list_property();
	}

	public List<Loan_officer> get_loan_officer_detail_list_avg() {
		return ld.get_loan_officer_detail_list_avg();
	}

	public List<Loan_officer> get_loan_officer_detail_list_name() {
		List<Loan_officer> list = ld.get_loan_officer_detail_list_name();
		System.out.println("list");
		List<Loan_officer> detail = new ArrayList<>();

		for (Loan_officer officer : list) {
			if (officer.getLocation().equals("pune"))
				detail.add(officer);

		}

		return detail;
	}

	public List<Loan_officer> get_loan_officer_detail_list_name_detail() {
		return ld.get_loan_officer_detail_list_name_detail();

	}

	public String get_loan_officer_detail_list_name_delete(int id) {
		return ld.get_loan_officer_detail_list_name_delete(id);

	}

	public List<Loan_officer> get_loan_officer_detail_list_name_in() {
		return ld.get_loan_officer_detail_list_name_in();
	}
	
	public List<Loan_officer> get_loan_officer_detail_list_name_count() {
		return ld.get_loan_officer_detail_list_name_count();
	}

}

