package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Caja;

public interface ICajaService {
	public List<Caja> listCajas();
	public Caja getCajaById(String id);
	public Caja saveCaja(Caja caja);
	public void deleteCaja(String id);
}
