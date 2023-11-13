package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaService implements ISalaService{
	@Autowired
	private ISalaDAO salaDAO;

	@Override
	public List<Sala> listSalas() {
		// TODO Auto-generated method stub
		return salaDAO.findAll();
	}

	@Override
	public Sala saveSala(Sala sala) {
		// TODO Auto-generated method stub
		return salaDAO.save(sala);
	}

	@Override
	public Sala getSalaById(Integer id) {
		// TODO Auto-generated method stub
		return salaDAO.findById(id).get();
	}

	@Override
	public void deleteSala(Integer id) {
		// TODO Auto-generated method stub
		salaDAO.deleteById(id);
	}
}
