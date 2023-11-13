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

import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaService;
@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
	
	@Autowired
	PeliculaService service;
	
	@GetMapping("")
	public List<Pelicula> listPeliculas(){
		return service.listPeliculas();
	}
	@GetMapping("/{id}")
	public Pelicula getPeliculaById(@PathVariable Integer id){
		return service.getPeliculaById(id);
	}
	@PostMapping("")
	public Pelicula addPelicula(@RequestBody Pelicula pelicula){
		return service.savePelicula(pelicula);
	}
	@PutMapping("/{id}")
	public Pelicula updatePelicula(@RequestBody Pelicula pelicula, @PathVariable Integer id){
		Pelicula peliculaActualizar = service.getPeliculaById(id);
		peliculaActualizar.setCalificacionEdad(pelicula.getCalificacionEdad());
		peliculaActualizar.setNombre(pelicula.getNombre());
		return service.savePelicula(peliculaActualizar);
	}
	@DeleteMapping("/{id}")
	public void deletePelicula(@PathVariable Integer id){
		service.deletePelicula(id);
	}
}
