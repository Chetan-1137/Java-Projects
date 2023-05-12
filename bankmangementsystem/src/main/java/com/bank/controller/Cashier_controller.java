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

import com.bank.entity.Cashier;
import com.bank.service.Cashier_service;

@RestController
public class Cashier_controller {
	@Autowired
	private Cashier_service cs;

	@PostMapping("insertCc")
	public String insert_Cashier_detail(@RequestBody Cashier detail) {
		return cs.insert_Cashier_detail(detail);
	}

	@PutMapping("updateCc")
	public String update_Cashier_datail(@RequestBody Cashier detail) {
		return cs.update_Cashier_detail(detail);
	}

	@DeleteMapping("/deleteCc/{id}")
	public String delete_Cashier_detail(@PathVariable int id) {
		return cs.delete_Cashier_detail(id);
	}

	@GetMapping("getdetailCc")
	public List<Cashier> get_detail_all_Cashiers() {
		return cs.get_detail_all_cashiers();
	}

	@GetMapping("/getCc/{id}")
	public Cashier get_detail_Cashier(@PathVariable int id) {
		return cs.get_detail_Cashier(id);

	}
	
	@GetMapping("getdetailstartwithscc")
	public List<Cashier> get_Cashier_detail_start_with_name_s() {
		return cs.get_Cashier_detail_start_with_name_s();
	}

	@GetMapping("getsalarycc")
	public List<Cashier> get_Cashier_detail_who_salary_1_lac() {
		return cs.get_Cashier_detail_who_salary_1_lac();
	}

	@GetMapping("getmaximumcc")
	public List<Cashier> get_Cashier_detail_maximum_salary() {
		return cs.get_Cashier_detail_maxisum_salary();

	}

	@GetMapping("getcountcc")
	public List<Cashier> get_Cashier_detail_all_count() {
		return cs.get_Cashier_detail_all_count();
	}

	@GetMapping("getbranchcc")
	public List<Cashier> get_Cashier_detail_branch_name_start_with() {
		return cs.get_Cashier_detail_branch_name_start_with();
	}

	@GetMapping("getnamecc")
	public List<Cashier> get_Cashier_detail_salary() {
		return cs.get_Cashier_detail_maxisum_salary();
	}

	@GetMapping("getsalarymincc")
	public List<Cashier> get_Cashier_detail_salary_minimum() {
		return cs.get_Cashier_detail_salary_minimum();
	}

	@GetMapping("getlistcc")
	public List<Cashier> get_Cashier_detail_list() {
		return cs.get_Cashier_detail_list();
	}

	@GetMapping("getpropertycc")
	public List<Cashier> get_Cashier_detail_list_property() {
		return cs.get_Cashier_detail_list_property();
	}

	@GetMapping("getavgcc")
	public List<Cashier> get_Cashier_detail_list_avg() {
		return cs.get_Cashier_detail_list_avg();
	}

	@GetMapping("getnamelistcc")
	public List<Cashier> get_Cashier_detail_list_name() {
		return cs.get_Cashier_detail_list_name();
	}

	@GetMapping("getnameqerycc")
	public List<Cashier> get_Cashier_detail_list_name_detail() {
		return cs.get_Cashier_detail_list_name_detail();

	}

	@DeleteMapping("/deletemanagercc/{id}")
	public String get_Cashier_detail_list_name_delete(@PathVariable int id) {
		return cs.get_Cashier_detail_list_name_delete(id);

	}

	@GetMapping("getsizenamecc")
	public List<Cashier> get_Cashier_detail_list_name_in() {
		return cs.get_Cashier_detail_list_name_in();
	}

	@GetMapping("getcountrowcc")
	public List<Cashier> get_Cashier_detail_list_name_count() {
		return cs.get_Cashier_detail_list_name_count();
	}

}

	
