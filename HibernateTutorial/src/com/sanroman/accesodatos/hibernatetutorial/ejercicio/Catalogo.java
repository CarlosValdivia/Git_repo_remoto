package com.sanroman.accesodatos.hibernatetutorial.ejercicio;

import java.util.List;

public class Catalogo {
	private String id;
	private String nombre;
	private List<Producto>productos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
