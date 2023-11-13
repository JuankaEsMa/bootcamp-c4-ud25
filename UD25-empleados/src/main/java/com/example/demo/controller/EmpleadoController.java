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

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoServideImpl;
	
	@GetMapping("")
	public List<Empleado> listarEmpleados(){
		return empleadoServideImpl.listarEmpleados();
	}
	
	@PostMapping("/add")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServideImpl.guardarEmpleado(empleado);
	}
	
	
	@GetMapping("/{dni}")
	public Empleado empleadoXID(@PathVariable(name="dni") String dni) {
		
		Empleado empleadoXId= new Empleado();
		
		empleadoXId=empleadoServideImpl.empleadoXID(dni);
				
		return empleadoXId;
	}
	
	@PutMapping("/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni")String dni,@RequestBody Empleado empleado) {
		
		Empleado empleadoSeleccionado= new Empleado();
		Empleado empleadoActualizado= new Empleado();
		
		empleadoSeleccionado= empleadoServideImpl.empleadoXID(dni);
		
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellidos(empleado.getApellidos());
		empleadoSeleccionado.setDepartamento(empleado.getDepartamento());
		
		empleadoActualizado = empleadoServideImpl.actualizarEmpleado(empleadoSeleccionado);
		
		
		return empleadoActualizado;
	}
	
	@DeleteMapping("/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni")String dni) {
		empleadoServideImpl.eliminarEmpleado(dni);
	}

	
}