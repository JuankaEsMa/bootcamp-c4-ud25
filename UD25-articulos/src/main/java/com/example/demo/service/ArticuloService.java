package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloService implements IArticuloService{

	@Autowired
	IArticuloDAO articuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		// TODO Auto-generated method stub
		return articuloDAO.findAll();
	}

	@Override
	public Articulo articuloXID(Integer id) {
		// TODO Auto-generated method stub
		return articuloDAO.findById(id).get();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloDAO.save(articulo);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Integer id) {
		// TODO Auto-generated method stub
		articuloDAO.deleteById(id);
	}

}
