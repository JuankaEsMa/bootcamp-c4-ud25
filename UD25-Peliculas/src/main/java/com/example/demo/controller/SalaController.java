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
import com.example.demo.dto.Sala;
import com.example.demo.service.SalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {
	@Autowired
	SalaService service;
	
	@GetMapping("")
	public List<Sala> listSalas(){
		return service.listSalas();
	}
	@GetMapping("/{id}")
	public Sala getSalaById(@PathVariable Integer id){
		return service.getSalaById(id);
	}
	@PostMapping("")
	public Sala addPelicula(@RequestBody Sala sala){
		return service.saveSala(sala);
	}
	@PutMapping("/{id}")
	public Sala updateSala(@RequestBody Sala sala, @PathVariable Integer id){
		Sala salaActualizar = service.getSalaById(id);
		salaActualizar.setNombre(sala.getNombre());
		salaActualizar.setPelicula(sala.getPelicula());
		return service.saveSala(salaActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteSala(@PathVariable Integer id){
		service.deleteSala(id);
	}
}
