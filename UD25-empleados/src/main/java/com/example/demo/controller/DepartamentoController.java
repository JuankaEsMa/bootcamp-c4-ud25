package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Departamento;
import com.example.demo.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	DepartamentoService service;
	
	@GetMapping("")
	public List<Departamento> listDepartamentos(){
		return service.listarDepartamentos();
	}
	
	@GetMapping("/{id}")
	public Departamento getDepartamentoById(@PathVariable(name="id") Integer id) {
		return service.departamentoXID(id);
	}
	@PostMapping("/add")
	public Departamento addDepartamento(@RequestBody Departamento departamento) {
		return service.guardarDepartamento(departamento);
	}
	@PutMapping("/{id}")
	public Departamento updateDepartamento(@PathVariable(name="id") Integer id, @RequestBody Departamento departamento) {
		Departamento departamentoActualizar = service.departamentoXID(id);
		departamentoActualizar.setNombre(departamento.getNombre());
		departamentoActualizar.setPresupuesto(departamento.getPresupuesto());
		return service.guardarDepartamento(departamentoActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteDepartamento(@PathVariable(name="id") Integer id) {
		service.eliminarDepartamento(id);
	}
}
