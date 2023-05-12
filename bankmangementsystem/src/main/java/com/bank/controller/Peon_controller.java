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

import com.bank.entity.Peon;
import com.bank.service.Peon_service;

@RestController
public class Peon_controller {
	@Autowired
	private Peon_service ps;
	
	@PostMapping("insertpeon")
	public String insert_detail_peon(@RequestBody Peon peon) {
		return ps.insert_detail_peon(peon);
		
	}
	
	@PutMapping("updatepeon")
	public String update_detail_peon(@RequestBody Peon peon) {
		return ps.update_detail_peon(peon);
	}
	@GetMapping("getpeon")
	public List<Peon> get_detail_peon(){
		return ps.get_detail_peon();
	}
	@GetMapping("getpeon1/{id}")
	public Peon get_detail_peon(@PathVariable int id) {
		return ps.get_detail_peon(id);
	}
	@DeleteMapping("deletepeon/{id}")
	public String delete_detail_peon(@PathVariable int id) {
		return ps.delete_detail_peon(id);
		
	}

}
