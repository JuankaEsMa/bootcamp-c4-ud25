package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {
	public List<Almacen> listAlmacenes();
	public Almacen getAlmacenById(Integer id);
	public Almacen saveAlmacen(Almacen almacen);
	public void deleteAlmacen(Integer id);
}
