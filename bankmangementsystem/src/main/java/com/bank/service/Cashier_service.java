package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Cashier_dao;
import com.bank.entity.Cashier;

@Service
public class Cashier_service {
	@Autowired
	private Cashier_dao cd;

	public String insert_Cashier_detail(Cashier detail) {
		return cd.insert_Cashier_detail(detail);

	}

	public String update_Cashier_detail(Cashier detail) {
		return cd.update_Cashier_detail(detail);
	}

	public String delete_Cashier_detail(int id) {
		return cd.delete_Cashier_detail(id);
	}

	public List<Cashier> get_detail_all_cashiers() {
		return cd.get_detail_all_Cashiers();
	}

	public Cashier get_detail_Cashier(int id) {
		return cd.get_detail_Cashier(id);
	}
	public List<Cashier> get_Cashier_detail_start_with_name_s() {
		return cd.get_Cashier_detail_start_with_name_s();
	}

	public List<Cashier> get_Cashier_detail_who_salary_1_lac() {
		List<Cashier> list = cd.get_Cashier_detail_who_salary_1_lac();
		List<Cashier> detail = new ArrayList<>();
		for (Cashier cashier : list) {
			if (cashier.getSalary() > 10000) {
				detail.add(cashier);
			} else {
				return null;

			}
		}
		return detail;

	}

	public List<Cashier> get_Cashier_detail_maxisum_salary() {
		return cd.get_Cashier_detail_maxisum_salary();
	}

	public List<Cashier> get_Cashier_detail_all_count() {
		return cd.get_Cashier_detail_all_count();
	}

	public List<Cashier> get_Cashier_detail_branch_name_start_with() {
		List<Cashier> list = cd.get_Cashier_detail_branch_name_start_with_();
		List<Cashier> detail = new ArrayList<>();
		for (Cashier cashier : list) {
			if (cashier.getBranch_name().equals("nashik")) {

				detail.add(cashier);

				return detail;

			} else {

				return null;
			}

		}

		return null;
	}

	public List<Cashier> get_Cashier_detail_salary() {
		return cd.get_Cashier_detail_maxisum_salary();

	}

	public List<Cashier> get_Cashier_detail_salary_minimum() {
		return cd.get_Cashier_detail_salary_minimum();
	}

	public List<Cashier> get_Cashier_detail_list() {

		return cd.get_Cashier_detail_list();
	}

	public List<Cashier> get_Cashier_detail_list_property() {
		return cd.get_Cashier_detail_list_property();
	}

	public List<Cashier> get_Cashier_detail_list_avg() {
		return cd.get_Cashier_detail_list_avg();
	}

	public List<Cashier> get_Cashier_detail_list_name() {
		List<Cashier> list = cd.get_Cashier_detail_list_name();
		List<Cashier> detail = new ArrayList<>();

		for (Cashier cashier : list) {
			if (cashier.getLocation().equals("pune"))
				detail.add(cashier);

		}

		return detail;
	}

	public List<Cashier> get_Cashier_detail_list_name_detail() {
		return cd.get_Cashier_detail_list_name_detail();

	}

	public String get_Cashier_detail_list_name_delete(int id) {
		return cd.get_Cashier_detail_list_name_delete(id);

	}

	public List<Cashier> get_Cashier_detail_list_name_in() {
		return cd.get_Cashier_detail_list_name_in();
	}
	
	public List<Cashier> get_Cashier_detail_list_name_count() {
		return cd.get_Cashier_detail_list_name_count();
	}

}



