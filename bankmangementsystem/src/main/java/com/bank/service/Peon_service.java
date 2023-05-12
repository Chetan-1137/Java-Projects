package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.Peon_dao;
import com.bank.entity.Peon;

@Service
public class Peon_service {
	@Autowired
    private Peon_dao pd;
	public String insert_detail_peon(Peon peon) {
		return pd.insert_detail_peon(peon);
	}
	public String update_detail_peon(Peon peon) {
		return pd.update_detail_peon(peon);
	}
	public List<Peon> get_detail_peon() {
		return pd.get_detail_peon();
		
	}
	public Peon get_detail_peon(int id) {
		return pd.get_detail_peon(id);
	}
	public String delete_detail_peon(int id) {
		return pd.delete_detail_peon(id);
	}
	
}
