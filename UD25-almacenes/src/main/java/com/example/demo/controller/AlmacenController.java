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

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenService;

@RestController
@RequestMapping("almacenes")
public class AlmacenController {
	
	@Autowired
	AlmacenService service;
	
	@GetMapping("")
	public List<Almacen> listAlmacenes(){
		return service.listAlmacenes();
	}
	@GetMapping("/{id}")
	public Almacen getAlmacenById(@PathVariable(name="id") Integer id) {
		return service.getAlmacenById(id);
	}
	@PostMapping("")
	public Almacen addAlmacen(@RequestBody Almacen almacen) {
		return service.saveAlmacen(almacen);
	}
	@PutMapping("/{id}")
	public Almacen updateAlmacen(@PathVariable(name="id") Integer id, @RequestBody Almacen almacen) {
		return service.saveAlmacen(almacen);
	}
	@DeleteMapping("/{id}")
	public void deleteAlmacen(@PathVariable(name="id") Integer id) {
		service.deleteAlmacen(id);
	}
}
