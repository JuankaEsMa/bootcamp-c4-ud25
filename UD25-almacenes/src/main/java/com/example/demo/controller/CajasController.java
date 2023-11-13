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

import com.example.demo.dto.Caja;
import com.example.demo.service.CajaService;

@RestController
@RequestMapping("cajas")
public class CajasController {
	
	@Autowired
	CajaService service;
	
	@GetMapping("")
	public List<Caja> listCajas(){
		return service.listCajas();
	}
	@GetMapping("/{id}")
	public Caja getCajaById(@PathVariable(name="id") String id) {
		return service.getCajaById(id);
	}
	@PostMapping("")
	public Caja addCaja(@RequestBody Caja caja) {
		System.out.println(caja.getAlmacen());
		return service.saveCaja(caja);
	}
	@PutMapping("/{id}")
	public Caja updateCaja(@PathVariable(name="id") String id, @RequestBody Caja caja) {
		return service.saveCaja(caja);
	}
	@DeleteMapping("/{id}")
	public void deleteCaja(@PathVariable(name="id") String id) {
		service.deleteCaja(id);
	}
}
