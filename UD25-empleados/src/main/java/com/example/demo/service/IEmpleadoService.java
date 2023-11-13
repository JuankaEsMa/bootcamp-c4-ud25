package com.example.demo.service;
import java.util.List;
import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	//Listar todos
	public List<Empleado> listarEmpleados();
	
	//Listar por id
	public Empleado empleadoXID(String id); 
	
	//Guardar
	public Empleado guardarEmpleado(Empleado cliente);
	
	//Actualizar
	public Empleado actualizarEmpleado(Empleado cliente);
	
	//Eliminar
	public void eliminarEmpleado(String id);

	
}
