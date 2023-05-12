package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Manager_dao;
import com.bank.entity.Bank_manager;

@Service
public class Manager_service {
	@Autowired
	private Manager_dao md;

	public List<Bank_manager> getAlldetail_manager() {
		return md.getAlldetail_manager();

	}

	public String insert_manager_detail(Bank_manager manager) {
		return md.insert_manager_detail(manager);
	}

	public String update_manager_detail(Bank_manager manager) {
		return md.update_manager_detail(manager);

	}

	public String delete_manager_detail(int id) {
		return md.delete_manager_detail(id);
	}

	public Bank_manager get_detail_manager(int id) {
		return md.get_detail_manager(id);

	}

	public List<Bank_manager> get_Bank_manager_detail_start_with_name_s() {
		return md.get_Bank_manager_detail_start_with_name_s();
	}

	public List<Bank_manager> get_Bank_manager_detail_who_salary_1_lac() {
		List<Bank_manager> list = md.get_Bank_manager_detail_who_salary_1_lac();
		List<Bank_manager> detail = new ArrayList<>();
		for (Bank_manager manager : list) {
			if (manager.getSalary() > 10000) {
				detail.add(manager);
			} else {
				return null;

			}
		}
		return detail;

	}

	public List<Bank_manager> get_Bank_manager_detail_maxisum_salary() {
		return md.get_Bank_manager_detail_maxisum_salary();
	}

	public List<Bank_manager> get_Bank_manager_detail_all_count() {
		return md.get_Bank_manager_detail_all_count();
	}

	public List<Bank_manager> get_Bank_manager_detail_branch_name_start_with() {
		List<Bank_manager> list = md.get_Bank_manager_detail_branch_name_start_with_();
		List<Bank_manager> detail = new ArrayList<>();
		for (Bank_manager bank_manager : list) {
			if (bank_manager.getBranch_name().equals("chalisgaon")) {

				detail.add(bank_manager);

				return detail;

			} else {

				return null;
			}

		}

		return null;
	}

	public List<Bank_manager> get_Bank_manager_detail_salary() {
		return md.get_Bank_manager_detail_maxisum_salary();

	}

	public List<Bank_manager> get_Bank_manager_detail_salary_minimum() {
		return md.get_Bank_manager_detail_salary_minimum();
	}

	public List<Bank_manager> get_Bank_manager_detail_list() {

		return md.get_Bank_manager_detail_list();
	}

	public List<Bank_manager> get_Bank_manager_detail_list_property() {
		return md.get_Bank_manager_detail_list_property();
	}

	public List<Bank_manager> get_Bank_manager_detail_list_avg() {
		return md.get_Bank_manager_detail_list_avg();
	}

	public List<Bank_manager> get_Bank_manager_detail_list_name() {
		List<Bank_manager> list = md.get_Bank_manager_detail_list_name();
		System.out.println("list");
		List<Bank_manager> detail = new ArrayList<>();

		for (Bank_manager manager : list) {
			if (manager.getLocation().equals("pune"))
				detail.add(manager);

		}

		return detail;
	}

	public List<Bank_manager> get_Bank_manager_detail_list_name_detail() {
		return md.get_Bank_manager_detail_list_name_detail();

	}

	public String get_Bank_manager_detail_list_name_delete(int id) {
		return md.get_Bank_manager_detail_list_name_delete(id);

	}

	public List<Bank_manager> get_Bank_manager_detail_list_name_in() {
		return md.get_Bank_manager_detail_list_name_in();
	}
	
	public List<Bank_manager> get_Bank_manager_detail_list_name_count() {
		return md.get_Bank_manager_detail_list_name_count();
	}

}
