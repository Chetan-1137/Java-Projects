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

import com.bank.entity.Clerk;
import com.bank.service.Clerk_service;
@RestController
public class Clerk_controller{
	
@Autowired
    private Clerk_service cs;

   @PostMapping("insetclerk")
	public String insert_detail_clerk(@RequestBody Clerk clerk) {
		return cs.insert_detail_clerk(clerk);
	}
   
   @PutMapping("updateclerk")
   public String update_detail_clerk(@RequestBody Clerk clerk) {
	   return cs.update_detail_clerk(clerk);
   }
   
   @GetMapping("getclerk")
   public List<Clerk> get_detail_clerk() {
	   return cs.get_detail_clerk();
   }
   @GetMapping("/getclerk1/{id}")
   public Clerk get_detail_clerk_1(@PathVariable int id) {
	   return cs.get_detail_clerk1(id);
   }
   
   @DeleteMapping("/deleteclerk/{id}")
   public String delete_clerk_detail(@PathVariable int id) {
	  return cs.delete_clerk_detail(id);
   }
   @GetMapping("getdetailstartwithsc")
	public List<Clerk> get_clerk_detail_start_with_name_s() {
		return cs.get_clerk_detail_start_with_name_s();
	}

	@GetMapping("getsalaryc")
	public List<Clerk> get_clerk_detail_who_salary_1_lac() {
		return cs.get_clerk_detail_who_salary_1_lac();
	}

	@GetMapping("getmaximumc")
	public List<Clerk> get_clerk_detail_maximum_salary() {
		return cs.get_clerk_detail_maxisum_salary();

	}

	@GetMapping("getcountc")
	public List<Clerk> get_clerk_detail_all_count() {
		return cs.get_clerk_detail_all_count();
	}

	@GetMapping("getbranchc")
	public List<Clerk> get_clerk_detail_branch_name_start_with() {
		return cs.get_clerk_detail_branch_name_start_with();
	}

	@GetMapping("getnamec")
	public List<Clerk> get_clerk_detail_salary() {
		return cs.get_clerk_detail_maxisum_salary();
	}

	@GetMapping("getsalaryminc")
	public List<Clerk> get_clerk_detail_salary_minimum() {
		return cs.get_clerk_detail_salary_minimum();
	}

	@GetMapping("getlistc")
	public List<Clerk> get_clerk_detail_list() {
		return cs.get_clerk_detail_list();
	}

	@GetMapping("getpropertyc")
	public List<Clerk> get_clerk_detail_list_property() {
		return cs.get_clerk_detail_list_property();
	}

	@GetMapping("getavgc")
	public List<Clerk> get_clerk_detail_list_avg() {
		return cs.get_clerk_detail_list_avg();
	}

	@GetMapping("getnamelistc")
	public List<Clerk> get_clerk_detail_list_name() {
		return cs.get_clerk_detail_list_name();
	}

	@GetMapping("getnameqeryc")
	public List<Clerk> get_clerk_detail_list_name_detail() {
		return cs.get_clerk_detail_list_name_detail();

	}

	@DeleteMapping("/deleteclerkc/{id}")
	public String get_clerk_detail_list_name_delete(@PathVariable int id) {
		return cs.get_clerk_detail_list_name_delete(id);

	}

	@GetMapping("getsizenamec")
	public List<Clerk> get_clerk_detail_list_name_in() {
		return cs.get_clerk_detail_list_name_in();
	}

	@GetMapping("getcountrowc")
	public List<Clerk> get_clerk_detail_list_name_count() {
		return cs.get_clerk_detail_list_name_count();
	}

}

	

    