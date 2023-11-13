package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteService implements IFabricanteService{

	@Autowired
	IFabricanteDAO fabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricante() {
		// TODO Auto-generated method stub
		return fabricanteDAO.findAll();
	}

	@Override
	public Fabricante fabricanteXID(Integer id) {
		// TODO Auto-generated method stub
		return fabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Integer id) {
		// TODO Auto-generated method stub
		fabricanteDAO.deleteById(id);
	}

}
