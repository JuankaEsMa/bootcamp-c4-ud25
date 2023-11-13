package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaService implements ICajaService{

	@Autowired
	ICajaDAO cajaDAO;
	
	@Override
	public List<Caja> listCajas() {
		// TODO Auto-generated method stub
		return cajaDAO.findAll();
	}

	@Override
	public Caja getCajaById(String id) {
		// TODO Auto-generated method stub
		return cajaDAO.findById(id).get();
	}

	@Override
	public Caja saveCaja(Caja caja) {
		// TODO Auto-generated method stub
		return cajaDAO.save(caja);
	}

	@Override
	public void deleteCaja(String id) {
		// TODO Auto-generated method stub
		cajaDAO.deleteById(id);
	}

}
