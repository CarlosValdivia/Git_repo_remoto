package com.sanroman.accesodatos.hibernatetutorial.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sanroman.accesodatos.hibernatetutorial.model.Domicilio;
import com.sanroman.accesodatos.hibernatetutorial.model.Usuario;

public class InsertarUsuarioTest {
	public static void main(String[] args) {
		//esta es la forma de obtener una factoria de sesiones
		Session session = null;
		Configuration cfg = new Configuration();
		//con el configure se le pide a la factoria que utilice el archivo de configuracion para ello.
		SessionFactory factory = cfg.configure().buildSessionFactory();
		System.out.println("iniciando sesion Hibernate....");
		//con esto abririamos una sesion de hibernate
		session = factory.openSession();
		System.out.println("sesion Hibernate iniciada....");
		//comenzar una transaccion. devolvera un objeto de tipo Transaction
		Transaction tr = session.beginTransaction();
		//insertarB
		//creando domicilio1
		Domicilio d1 = new Domicilio();
		d1.setTipoVia(1);
		d1.setCodigoPostal(28020);
		d1.setNombreVia("luna");
		d1.setNumero(20);
		
		//creando domicilio1
		Domicilio d2 = new Domicilio();
		d2.setTipoVia(2);
		d2.setCodigoPostal(28030);
		d2.setNombreVia("sol");
		d2.setNumero(20);
		
		//creando usuario
		Usuario user = new Usuario();
		user.setId(34);
		//asignamos domicilio a usuario
		user.setDomicilioPrincipal(d1);
		user.setDomicilioSecundario(d2);
		user.setEmail("luis@gmail.com");
		user.setName("Jose");
		user.setTelefono("913612980");
		//lo salvamos dentro de la sesion de hibernate con session.save(...);
		session.save(user);
		//insertarE
		tr.commit();
		//con esto se cerrara la sesion
		session.close();
		System.out.println("cerrando sesion Hibernate....");

	}

}
