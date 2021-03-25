package com.example.demo.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	
	private static SessionFactory factory;
	
	
	static{
		try {
			
			Configuration configuration = new Configuration().configure();
			
			factory = configuration.buildSessionFactory();
		
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	
	public static SessionFactory getSessionFactory() {

		return factory;
	
	}

}
