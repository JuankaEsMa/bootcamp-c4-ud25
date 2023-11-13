package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="articulos")
    private List<Articulo> articulos;
	
	public Fabricante(){
		
	}
	
	public Fabricante(int codigo, String nombre, List<Articulo> articulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.articulos = articulos;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulos")
	public List<Articulo> getVideo() {
		return articulos;
	}
	
	public void setVideo(List<Articulo> video) {
		this.articulos = video;
	}
	
}
