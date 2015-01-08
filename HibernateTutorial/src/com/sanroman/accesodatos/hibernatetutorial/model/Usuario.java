package com.sanroman.accesodatos.hibernatetutorial.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuario {
	@Id
	private int id;
	private String name;
	private String domicilio;
	private String email;
	private String telefono;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void print(){
		System.out.println("User[id:"+id+"nombre: "+name+"]");
	}
	
}
