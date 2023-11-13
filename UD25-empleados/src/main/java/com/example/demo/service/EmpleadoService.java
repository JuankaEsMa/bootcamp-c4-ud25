package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Empleado;
import com.example.demo.dao.IEmpleadoDAO;


@Service
public class EmpleadoService implements IEmpleadoService {
	
	@Autowired
	IEmpleadoDAO iClienteDAO;

	//Listar todos
		public List<Empleado> listarEmpleados(){
			return iClienteDAO.findAll();
		};
		
		//Listar por id
		public Empleado empleadoXID(String dni) {
			return iClienteDAO.findById(dni).get();
		}; 
		
		//Guardar
		public Empleado guardarEmpleado(Empleado cliente) {
			return iClienteDAO.save(cliente);
		};
		
		//Actualizar
		public Empleado actualizarEmpleado(Empleado cliente) {
			return iClienteDAO.save(cliente);
		};
		
		//Eliminar
		public void eliminarEmpleado(String dni) {
			iClienteDAO.deleteById(dni);
		}

}
