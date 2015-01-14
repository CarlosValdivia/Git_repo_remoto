package com.sanroman.accesodatos.hibernatetutorial.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//delimita que se tiene que fijar en una tabla de la bbdd
@Table(name ="user_tabla")//name es un atributo que describe el nombre de la tabla
public class Usuario {
	@Id
	//@column describe cual es la columna de la tabla
	@Column(name ="user_id")
	private int id;
	@Column(name ="user_name")
	private String name;
	@Embedded
	//@AttributeOverride se utiliza para redefinir la informacion de un domicilio.
		//si se quieren redefinir varios atributos hay que utilizar @AttributeOverrides
		@AttributeOverrides(value = { @AttributeOverride(column = @Column(name ="tipo_via_dom1"), name = "tipoVia"),
		@AttributeOverride(column = @Column(name ="nombre_via_dom1"), name = "nombreVia"),
		@AttributeOverride(column = @Column(name ="numero_via_dom1"), name = "numero"),
		@AttributeOverride(column = @Column(name ="codigo_via_dom1"), name = "codigoPostal") })
	private Domicilio domicilioPrincipal;
	@Embedded
	//@AttributeOverride se utiliza para redefinir la informacion de un domicilio.
		//si se quieren redefinir varios atributos hay que utilizar @AttributeOverrides
		@AttributeOverrides(value = { @AttributeOverride(column = @Column(name ="tipo_via_dom2"), name = "tipoVia"),
		@AttributeOverride(column = @Column(name ="nombre_via_dom2"), name = "nombreVia"),
		@AttributeOverride(column = @Column(name ="numero_via_dom2"), name = "numero"),
		@AttributeOverride(column = @Column(name ="codigo_via_dom2"), name = "codigoPostal") })
	private Domicilio domicilioSecundario;
	@Column(name ="user_email")
	private String email;
	@Column(name ="user_telephone")
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
	
	public Domicilio getDomicilioPrincipal() {
		return domicilioPrincipal;
	}
	public void setDomicilioPrincipal(Domicilio domicilioPrincipal) {
		this.domicilioPrincipal = domicilioPrincipal;
	}
	public Domicilio getDomicilioSecundario() {
		return domicilioSecundario;
	}
	public void setDomicilioSecundario(Domicilio domicilioSecundario) {
		this.domicilioSecundario = domicilioSecundario;
	}
	
	
	public void print(){
		System.out.println("User[id: "+id+" nombre: "+name+", domicilioPrincipal: "+domicilioPrincipal.toString()+ 
				", domicilioPrincipal: "+domicilioSecundario.toString()+" ]");
	}
	
}
