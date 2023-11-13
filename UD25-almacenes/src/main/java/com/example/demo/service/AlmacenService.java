package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenService implements IAlmacenService{

	@Autowired
	IAlmacenDAO almacenDAO;
	
	@Override
	public List<Almacen> listAlmacenes() {
		// TODO Auto-generated method stub
		return almacenDAO.findAll();
	}

	@Override
	public Almacen getAlmacenById(Integer id) {
		// TODO Auto-generated method stub
		return almacenDAO.findById(id).get();
	}

	@Override
	public Almacen saveAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return almacenDAO.save(almacen);
	}

	@Override
	public void deleteAlmacen(Integer id) {
		// TODO Auto-generated method stub
		almacenDAO.deleteById(id);
	}

}
