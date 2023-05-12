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

import com.bank.entity.Bank_manager;
import com.bank.service.Manager_service;

@RestController
public class Manager_controller {
	@Autowired
	private Manager_service ms;

	@GetMapping("manager")
	public List<Bank_manager> getAlldetail_manager() {
		return ms.getAlldetail_manager();

	}

	@PostMapping("insert")
	public String insert_manager_detail(@RequestBody Bank_manager manager) {
		return ms.insert_manager_detail(manager);

	}

	@PutMapping("update")
	public String update_manager_detail(@RequestBody Bank_manager manager) {
		return ms.update_manager_detail(manager);
	}

	@DeleteMapping("/delete/{id}")
	public String delete_manager_detail(@PathVariable int id) {
		return ms.delete_manager_detail(id);

	}

	@GetMapping("/getMm/{id}")
	public Bank_manager get_detail_manager(@PathVariable int id) {
		return ms.get_detail_manager(id);

	}

	@GetMapping("getdetailstartwiths")
	public List<Bank_manager> get_Bank_manager_detail_start_with_name_s() {
		return ms.get_Bank_manager_detail_start_with_name_s();
	}

	@GetMapping("getsalary")
	public List<Bank_manager> get_Bank_manager_detail_who_salary_1_lac() {
		return ms.get_Bank_manager_detail_who_salary_1_lac();
	}

	@GetMapping("getmaximum")
	public List<Bank_manager> get_Bank_manager_detail_maximum_salary() {
		return ms.get_Bank_manager_detail_maxisum_salary();

	}

	@GetMapping("getcount")
	public List<Bank_manager> get_Bank_manager_detail_all_count() {
		return ms.get_Bank_manager_detail_all_count();
	}

	@GetMapping("getbranch")
	public List<Bank_manager> get_Bank_manager_detail_branch_name_start_with() {
		return ms.get_Bank_manager_detail_branch_name_start_with();
	}

	@GetMapping("getname")
	public List<Bank_manager> get_Bank_manager_detail_salary() {
		return ms.get_Bank_manager_detail_maxisum_salary();
	}

	@GetMapping("getsalarymin")
	public List<Bank_manager> get_Bank_manager_detail_salary_minimum() {
		return ms.get_Bank_manager_detail_salary_minimum();
	}

	@GetMapping("getlist")
	public List<Bank_manager> get_Bank_manager_detail_list() {
		return ms.get_Bank_manager_detail_list();
	}

	@GetMapping("getproperty")
	public List<Bank_manager> get_Bank_manager_detail_list_property() {
		return ms.get_Bank_manager_detail_list_property();
	}

	@GetMapping("getavg")
	public List<Bank_manager> get_Bank_manager_detail_list_avg() {
		return ms.get_Bank_manager_detail_list_avg();
	}

	@GetMapping("getnamelist")
	public List<Bank_manager> get_Bank_manager_detail_list_name() {
		return ms.get_Bank_manager_detail_list_name();
	}

	@GetMapping("getnameqery")
	public List<Bank_manager> get_Bank_manager_detail_list_name_detail() {
		return ms.get_Bank_manager_detail_list_name_detail();

	}

	@DeleteMapping("/deletemanager/{id}")
	public String get_Bank_manager_detail_list_name_delete(@PathVariable int id) {
		return ms.get_Bank_manager_detail_list_name_delete(id);

	}

	@GetMapping("getsizename")
	public List<Bank_manager> get_Bank_manager_detail_list_name_in() {
		return ms.get_Bank_manager_detail_list_name_in();
	}

	@GetMapping("getcountrow")
	public List<Bank_manager> get_Bank_manager_detail_list_name_count() {
		return ms.get_Bank_manager_detail_list_name_count();
	}

}
