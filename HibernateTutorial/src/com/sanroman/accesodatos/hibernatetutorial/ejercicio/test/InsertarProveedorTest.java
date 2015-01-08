package com.sanroman.accesodatos.hibernatetutorial.ejercicio.test;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sanroman.accesodatos.hibernatetutorial.ejercicio.Proveedor;

public class InsertarProveedorTest {
	public static void main(String[] args) {
		Session session = null;
		Configuration configuracion = new Configuration();
		SessionFactory SessionFactory = configuracion.configure().buildSessionFactory();
		session = SessionFactory.openSession();
		Transaction tr = (Transaction) session.beginTransaction();
		//insertarProveedor
		Proveedor proveedor = new Proveedor();
	}
}
