package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService{

	@Autowired
	IDepartamentoDAO departamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return departamentoDAO.findAll();
	}

	@Override
	public Departamento departamentoXID(Integer id) {
		// TODO Auto-generated method stub
		return departamentoDAO.findById(id).get();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDAO.save(departamento);
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Integer id) {
		// TODO Auto-generated method stub
		departamentoDAO.deleteById(id);
	}

}
