package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Clerk_dao;
import com.bank.entity.Clerk;

@Service
public class Clerk_service {
	@Autowired
	private Clerk_dao cd;

	public String insert_detail_clerk(Clerk clerk) {
		return cd.insert_detail_clerk(clerk);

	}

	public String update_detail_clerk(Clerk clerk) {
		return cd.update_detail_clerk(clerk);
	}

	public List<Clerk> get_detail_clerk() {
		return cd.get_detail_clerk();
	}

	public Clerk get_detail_clerk1(int id) {
		return cd.get_detail_clerk1(id);
	}

	public String delete_clerk_detail(int id) {
		return cd.delete_clerk_detail(id);

	}

	public List<Clerk> get_clerk_detail_start_with_name_s() {
		return cd.get_clerk_detail_start_with_name_s();
	}

	public List<Clerk> get_clerk_detail_who_salary_1_lac() {
		List<Clerk> list = cd.get_clerk_detail_who_salary_1_lac();
		List<Clerk> detail = new ArrayList<>();
		for (Clerk clerk : list) {
			if (clerk.getSalary() > 10000) {
				detail.add(clerk);
			} else {
				return null;

			}
		}
		return detail;

	}

	public List<Clerk> get_clerk_detail_maxisum_salary() {
		return cd.get_clerk_detail_maxisum_salary();
	}

	public List<Clerk> get_clerk_detail_all_count() {
		return cd.get_clerk_detail_all_count();
	}

	public List<Clerk> get_clerk_detail_branch_name_start_with() {
		List<Clerk> list = cd.get_clerk_detail_branch_name_start_with_();
		List<Clerk> detail = new ArrayList<>();
		for (Clerk clerk : list) {
			if (clerk.getBranch_name().equals("pune")) {

				detail.add(clerk);

				return detail;

			} else {

				return null;
			}

		}

		return null;
	}

	public List<Clerk> get_clerk_detail_salary() {
		return cd.get_clerk_detail_maxisum_salary();

	}

	public List<Clerk> get_clerk_detail_salary_minimum() {
		return cd.get_clerk_detail_salary_minimum();
	}

	public List<Clerk> get_clerk_detail_list() {

		return cd.get_clerk_detail_list();
	}

	public List<Clerk> get_clerk_detail_list_property() {
		return cd.get_clerk_detail_list_property();
	}

	public List<Clerk> get_clerk_detail_list_avg() {
		return cd.get_clerk_detail_list_avg();
	}

	public List<Clerk> get_clerk_detail_list_name() {
		List<Clerk> list = cd.get_clerk_detail_list_name();
		List<Clerk> detail = new ArrayList<>();

		for (Clerk clerk : list) {
			if (clerk.getLocation().equals("Beed"))
				detail.add(clerk);

		}

		return detail;
	}

	public List<Clerk> get_clerk_detail_list_name_detail() {
		return cd.get_clerk_detail_list_name_detail();

	}

	public String get_clerk_detail_list_name_delete(int id) {
		return cd.get_clerk_detail_list_name_delete(id);

	}

	public List<Clerk> get_clerk_detail_list_name_in() {
		return cd.get_clerk_detail_list_name_in();
	}

	public List<Clerk> get_clerk_detail_list_name_count() {
		return cd.get_clerk_detail_list_name_count();
	}

}
