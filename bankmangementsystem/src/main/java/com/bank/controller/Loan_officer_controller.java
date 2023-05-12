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

import com.bank.entity.Loan_officer;
import com.bank.service.Loan_officer_service;

@RestController
public class Loan_officer_controller {
	@Autowired
	private Loan_officer_service ls;
	
	@PostMapping("officer")
	public String insert_detail_loan_officer(@RequestBody Loan_officer officer) {
		return ls.insert_detail_loan_officer(officer);
	}
	
	@PutMapping("updateloan")
	public String update_detail_loan_officer(@RequestBody Loan_officer officer) {
		return ls.update_detail_loan_officer(officer);
	}
	
	@GetMapping("getloan")
	public List<Loan_officer> get_loan_officer_detail() {
		return ls. get_loan_officer_detail();
	}
	 
	@GetMapping("getloan1/{id}")
	public Loan_officer  get_loan_officer_detail(@PathVariable int id ) {
		return ls.get_loan_officer_detail(id);
	}
	
	@DeleteMapping("deleteloan/{id}")
	public String delete_detail_loan_officer(@PathVariable int id ) {
		return ls.delete_detail_loan_officer(id);
	}	@GetMapping("getdetailstartwithsll")
	public List<Loan_officer> get_loan_officer_detail_start_with_name_s() {
		return ls.get_loan_officer_detail_start_with_name_s();
	}

	@GetMapping("getsalaryll")
	public List<Loan_officer> get_loan_officer_detail_who_salary_1_lac() {
		return ls.get_loan_officer_detail_who_salary_1_lac();
	}

	@GetMapping("getmaximumll")
	public List<Loan_officer> get_loan_officer_detail_maximum_salary() {
		return ls.get_loan_officer_detail_maxisum_salary();

	}

	@GetMapping("getcountll")
	public List<Loan_officer> get_loan_officer_detail_all_count() {
		return ls.get_loan_officer_detail_all_count();
	}

	@GetMapping("getbranchll")
	public List<Loan_officer> get_loan_officer_detail_branch_name_start_with() {
		return ls.get_loan_officer_detail_branch_name_start_with();
	}

	@GetMapping("getnamell")
	public List<Loan_officer> get_loan_officer_detail_salary() {
		return ls.get_loan_officer_detail_maxisum_salary();
	}

	@GetMapping("getsalaryminll")
	public List<Loan_officer> get_loan_officer_detail_salary_minimum() {
		return ls.get_loan_officer_detail_salary_minimum();
	}

	@GetMapping("getlistll")
	public List<Loan_officer> get_loan_officer_detail_list() {
		return ls.get_loan_officer_detail_list();
	}

	@GetMapping("getpropertyll")
	public List<Loan_officer> get_loan_officer_detail_list_property() {
		return ls.get_loan_officer_detail_list_property();
	}

	@GetMapping("getavgll")
	public List<Loan_officer> get_loan_officerr_detail_list_avg() {
		return ls.get_loan_officer_detail_list_avg();
	}

	@GetMapping("getnamelistll")
	public List<Loan_officer> get_loan_officer_detail_list_name() {
		return ls.get_loan_officer_detail_list_name();
	}

	@GetMapping("getnameqeryll")
	public List<Loan_officer> get_loan_officer_detail_list_name_detail() {
		return ls.get_loan_officer_detail_list_name_detail();

	}

	@DeleteMapping("/deleteLoanofficer/{id}")
	public String get_loan_officer_detail_list_name_delete(@PathVariable int id) {
		return ls.get_loan_officer_detail_list_name_delete(id);

	}

	@GetMapping("getsizenamell")
	public List<Loan_officer> get_loan_officer_detail_list_name_in() {
		return ls.get_loan_officer_detail_list_name_in();
	}

	@GetMapping("getcountrowll")
	public List<Loan_officer> get_loan_officer_detail_list_name_count() {
		return ls.get_loan_officer_detail_list_name_count();
	}

}



