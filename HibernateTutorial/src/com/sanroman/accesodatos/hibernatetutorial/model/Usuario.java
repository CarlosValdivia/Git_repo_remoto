package com.sanroman.accesodatos.hibernatetutorial.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
//delimita que se tiene que fijar en una tabla de la bbdd
@Table(name ="user_tabla")//name es un atributo que describe el nombre de la tabla
public class Usuario {
	@Id
	//@column describe cual es la columna de la tabla
	@Column(name ="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)//strategy define la estrategia que utilizara hibernate para generar ese valor de forma automatica
	private int id;
	@Column(name ="user_name")
	private String name;
	@Column(name ="user_email")
	private String email;
	@Column(name ="user_telephone")
	private String telefono;
	
	@ElementCollection
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@JoinTable(name="user_domicilio",joinColumns={@JoinColumn(name="user_id")})//joinColumns es para describir una clave ajena que se va referenciar a una tabla.
	@CollectionId(columns = { @Column(name="domicilio_id") }, generator = "hilo-gen", type = @Type(type = "long"))//@Column representa la columna que hara de identificador
	//@Type representa el tipo de esa clave, generator es la referencia a un generador de claves
	private List<Domicilio>Domicilios = new ArrayList<Domicilio>();
	
	
	
	public List<Domicilio> getDomicilios() {
		return Domicilios;
	}
	public void setDomicilios(List<Domicilio> domicilios) {
		Domicilios = domicilios;
	}
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
		System.out.println("User[id: "+id+" nombre: "+name+"]");
	}
	
}
