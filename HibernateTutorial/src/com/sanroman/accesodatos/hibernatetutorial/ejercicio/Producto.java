package com.sanroman.accesodatos.hibernatetutorial.ejercicio;

import java.net.URL;

public class Producto {
	private String id;
	private String nombre;
	private double precio;
	private URL infoUrl;
	private Proveedor proveedor;
	
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public URL getInfoUrl() {
		return infoUrl;
	}
	public void setInfoUrl(URL infoUrl) {
		this.infoUrl = infoUrl;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
}
