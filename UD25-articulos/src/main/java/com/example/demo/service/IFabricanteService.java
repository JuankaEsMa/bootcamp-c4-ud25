package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {
	public List<Fabricante> listarFabricante();
	
	public Fabricante fabricanteXID(Integer id); 
	
	public Fabricante guardarFabricante(Fabricante cliente);
	
	public Fabricante actualizarFabricante(Fabricante cliente);
	
	public void eliminarFabricante(Integer id);
}
