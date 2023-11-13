package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Fabricante;
import com.example.demo.service.IFabricanteService;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
	@Autowired
	IFabricanteService fabricanteService;
	
	@GetMapping("")
	public List<Fabricante> listarFabricantes(){
		return fabricanteService.listarFabricante();
	}
	@GetMapping("/{id}")
	public Fabricante getFabricanteById(@PathVariable(name="id") Integer id) {
		return fabricanteService.fabricanteXID(id);
	}
	@PostMapping("/add")
	public Fabricante añadirFabricante(Fabricante fabricante) {
		return fabricanteService.guardarFabricante(fabricante);
	}
	
	@PutMapping("/{id}")
	public Fabricante updateFabricante(@PathVariable(name="id") Integer id, Fabricante fabricante) {
		return fabricanteService.actualizarFabricante(fabricante);
	}
	@DeleteMapping("/{id}")
	public void deleteFabricante(@PathVariable(name="id") Integer id) {
		fabricanteService.eliminarFabricante(id);
	}
}
