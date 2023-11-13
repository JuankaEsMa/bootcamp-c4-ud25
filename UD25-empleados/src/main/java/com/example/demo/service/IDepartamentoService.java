package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> listarDepartamentos();
	
	public Departamento departamentoXID(Integer id); 
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void eliminarDepartamento(Integer id);
}
