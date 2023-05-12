package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Account_opener_dao;
import com.bank.entity.Account_opener;


@Service
public class Account_opener_service {
	@Autowired
	private Account_opener_dao Ad;

	public String insert_Account_opener_detail(Account_opener opener) {
		return Ad.insert_Account_opener_detail(opener);

	}

	public Account_opener get_Account_opener_detail(int id) {
		return Ad.get_Account_opener_detail(id);

	}

	public String update_Account_opener_detail(Account_opener opener) {
		return Ad.update_Account_opener_detail(opener);
	}

	public String delete_Account_opener_detail(int id) {
		return Ad.delete_Account_opener_detail(id);
	}
	
	public List<Account_opener> get_detail_all_Account_openers() {
		return Ad.get_detail_all_Account_openers();
	}
	
	public List<Account_opener> get_Account_opener_detail_start_with_name_s() {
		return Ad.get_Account_opener_detail_start_with_name_s();
	}

	public List<Account_opener> get_Account_opener_detail_who_salary_1_lac() {
		List<Account_opener> list = Ad.get_Account_opener_detail_who_salary_1_lac();
		List<Account_opener> detail = new ArrayList<>();
		for (Account_opener opener : list) {
			if (opener.getSalary() > 10000) {
				detail.add(opener);
			} else {
				return null;

			}
		}
		return detail;

	}

	public List<Account_opener> get_Account_opener_detail_maxisum_salary() {
		return Ad.get_Account_opener_maxisum_salary();
	}

	public List<Account_opener> get_Account_opener_detail_all_count() {
		return Ad.get_Account_opener_detail_all_count();
	}

	public List<Account_opener> get_Account_opener_detail_branch_name_start_with() {
		List<Account_opener> list = Ad.get_Account_opener_detail_branch_name_start_with_();
		List<Account_opener> detail = new ArrayList<>();
		for (Account_opener opener : list) {
			if (opener.getBranch_name().equals("chalisgaon")) {

				detail.add(opener);

				return detail;

			} else {

				return null;
			}

		}

		return null;
	}

	public List<Account_opener> get_Account_opener_detail_salary() {
		return Ad.get_Account_opener_detail_salary();

	}

	public List<Account_opener> get_Account_opener_detail_salary_minimum() {
		return Ad.get_Account_opener_detail_salary_minimum();
	}

	public List<Account_opener> get_Account_opener_detail_list() {

		return Ad.get_Account_opener_detail_list();
	}

	public List<Account_opener> get_Account_opener_detail_list_property() {
		return Ad.get_Account_opener_detail_list_property();
	}

	public List<Account_opener> get_Account_opener_detail_list_avg() {
		return Ad.get_Account_opener_detail_list_avg();
	}

	public List<Account_opener> get_Account_opener_detail_list_name() {
		List<Account_opener> list = Ad.get_Account_opener_detail_list_name();
		System.out.println("list");
		List<Account_opener> detail = new ArrayList<>();

		for (Account_opener opener : list) {
			if (opener.getLocation().equals("mumbai"))
				detail.add(opener);

		}

		return detail;
	}

	public List<Account_opener> get_Account_opener_detail_list_name_detail() {
		return Ad.get_Account_opener_detail_list_name_detail();

	}

	public String get_Account_opener_detail_list_name_delete(int id) {
		return Ad.get_Account_opener_detail_list_name_delete(id);

	}

	public List<Account_opener> get_Account_opener_detail_list_name_in() {
		return Ad.get_Account_opener_detail_list_name_in();
	}
	
	public List<Account_opener> get_Account_opener_detail_list_name_count() {
		return Ad.get_Account_opener_detail_list_name_count();
	}

}

