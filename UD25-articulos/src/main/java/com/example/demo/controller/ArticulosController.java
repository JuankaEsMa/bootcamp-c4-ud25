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

import com.example.demo.dto.Articulo;
import com.example.demo.service.ArticuloService;

@RestController
@RequestMapping("/articulos")
public class ArticulosController {
	
	@Autowired
	ArticuloService articuloService;
	
	@GetMapping("")
	public List<Articulo> listarArticulos(){
		return articuloService.listarArticulos();
	}
	@GetMapping("/{id}")
	public Articulo getArticuloById(@PathVariable(name="id") Integer id) {
		return articuloService.articuloXID(id);
	}
	@PostMapping("/add")
	public Articulo añadirArticulo(Articulo articulo) {
		return articuloService.guardarArticulo(articulo);
	}
	
	@PutMapping("/{id}")
	public Articulo updateArticulo(@PathVariable(name="id") Integer id, Articulo articulo) {
		Articulo articuloAnterior = articuloService.articuloXID(id);
		articuloAnterior.setFabricante(articulo.getFabricante());
		articuloAnterior.setNombre(articulo.getNombre());
		articuloAnterior.setPrecio(articulo.getPrecio());
		return articuloService.guardarArticulo(articuloAnterior);
	}
	@DeleteMapping("/{id}")
	public void deleteArticulo(@PathVariable(name="id") Integer id) {
		articuloService.eliminarArticulo(id);
	}
}
