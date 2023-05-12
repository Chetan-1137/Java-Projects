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

import com.bank.entity.Security_guard;
import com.bank.service.Security_guard_service;

@RestController
public class Security_guard_controller {

	@Autowired
	private Security_guard_service ss;

	@PostMapping("insertdetailse")
	public String insert_detail_security_gaurd(@RequestBody Security_guard guard) {
		return ss.insert_detail_security_gaurd(guard);
	}
	
	@PutMapping("updatesecurity")
	public String update_detail_security_gaurd(@RequestBody Security_guard guard) {
		return ss.update_detail_security_gaurd(guard);
		
	}
	@GetMapping("getsecurity")
	public List<Security_guard> get_detail_security_gaurd() {
		return ss.get_detail_security_gaurd();
	}
	
	@GetMapping("/getss/{id}")
	public Security_guard get_detail_security_gaurd(@PathVariable int id) {
		return ss.get_detail_security_gaurd(id);
	}
	
	@DeleteMapping("deletegaurd/{id}")
	public String delete_detail_security_gaurd(@PathVariable int id) {
		return ss.delete_detail_security_gaurd(id);
	}
}

