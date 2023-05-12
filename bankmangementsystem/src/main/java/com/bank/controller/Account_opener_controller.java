package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account_opener;
import com.bank.service.Account_opener_service;

@RestController
public class Account_opener_controller {
	@Autowired
	private Account_opener_service Ac;

	@PostMapping("inserAc")
	public String insert_Account_opener_detail(@RequestBody Account_opener opener) {
		return Ac.insert_Account_opener_detail(opener);

	}

	@GetMapping("/get/{id}")
	public Account_opener get_Account_opener_detail(@PathVariable int id ) {
		return Ac.get_Account_opener_detail(id);
	}

	@PutMapping("updateAc")
	public String update_Account_opener_detail(@RequestBody Account_opener opener) {
		return Ac.update_Account_opener_detail(opener);

	}
	@DeleteMapping("/deleteAc/{id}")
	public String delete_Account_opener_detail(@PathVariable int id ) {
		return Ac.delete_Account_opener_detail(id);
	}
	
	@GetMapping("getAc")
	public List<Account_opener> get_detail_all_Account_opener() {
		return Ac.get_detail_all_Account_openers();
	}
	
	@GetMapping("getdetailstartwithsAc")
	public List<Account_opener> get_Account_opener_detail_start_with_name_s() {
		return Ac.get_Account_opener_detail_start_with_name_s();
	}

	@GetMapping("getsalaryAc")
	public List<Account_opener> get_Account_opener_detail_who_salary_1_lac() {
		return Ac.get_Account_opener_detail_who_salary_1_lac();
	}

	@GetMapping("getmaximumAc")
	public List<Account_opener> get_Account_opener_detail_maximum_salary() {
		return Ac.get_Account_opener_detail_maxisum_salary();

	}

	@GetMapping("getcountAc")
	public List<Account_opener> get_Account_opener_detail_all_count() {
		return Ac.get_Account_opener_detail_all_count();
	}

	@GetMapping("getbranchAc")
	public List<Account_opener> get_Account_opener_detail_branch_name_start_with() {
		return Ac.get_Account_opener_detail_branch_name_start_with();
	}

	@GetMapping("getnameAcopenr")
	public List<Account_opener> get_Account_opener_detail_salary() {
		return Ac.get_Account_opener_detail_maxisum_salary();
	}

	@GetMapping("getsalaryminAc")
	public List<Account_opener> get_Account_opener_detail_salary_minimum() {
		return Ac.get_Account_opener_detail_salary_minimum();
	}

	@GetMapping("getlistAc")
	public List<Account_opener> get_Account_opener_detail_list() {
		return Ac.get_Account_opener_detail_list();
	}

	@GetMapping("getpropertyAc")
	public List<Account_opener> get_Account_opener_detail_list_property() {
		return Ac.get_Account_opener_detail_list_property();
	}

	@GetMapping("getavgAC")
	public List<Account_opener> get_Account_opener_detail_list_avg() {
		return Ac.get_Account_opener_detail_list_avg();
	}

	@GetMapping("getnamelistAc")
	public List<Account_opener> get_Account_opener_detail_list_name() {
		return Ac.get_Account_opener_detail_list_name();
	}

	@GetMapping("getnameqeryAc")
	public List<Account_opener> get_Account_opener_detail_list_name_detail() {
		return Ac.get_Account_opener_detail_list_name_detail();

	}

	@DeleteMapping("/deleteACopener/{id}")
	public String get_Account_opener_detail_list_name_delete(@PathVariable int id) {
		return Ac.get_Account_opener_detail_list_name_delete(id);

	}

	@GetMapping("getsizenameAc")
	public List<Account_opener> get_Account_opener_detail_list_name_in() {
		return Ac.get_Account_opener_detail_list_name_in();
	}

	@GetMapping("getcountrowAc")
	public List<Account_opener> get_Account_opener_detail_list_name_count() {
		return Ac.get_Account_opener_detail_list_name_count();
	}

}



