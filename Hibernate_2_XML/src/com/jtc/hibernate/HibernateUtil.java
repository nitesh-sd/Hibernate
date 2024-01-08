package com.jtc.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory=null;
	static {
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
		
	}
	
	
	
}
