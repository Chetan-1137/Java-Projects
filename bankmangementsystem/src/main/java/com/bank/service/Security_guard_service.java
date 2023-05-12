package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Security_guard_dao;
import com.bank.entity.Security_guard;
@Service
public class Security_guard_service {
@Autowired
  private Security_guard_dao sd;
	public String insert_detail_security_gaurd(Security_guard guard) {
		return sd.insert_detail_security_gaurd(guard);
		
	}
	public String update_detail_security_gaurd(Security_guard guard) {
		return sd.update_detail_security_gaurd(guard);
		
	}
	public List<Security_guard> get_detail_security_gaurd() {
		return sd.get_detail_security_gaurd();
		
	}
	public Security_guard get_detail_security_gaurd(int id) {
		return sd.get_detail_security_gaurd(id);
	}
	public String delete_detail_security_gaurd(int id) {
		return sd.delete_detail_security_gaurd(id);
	}

}
