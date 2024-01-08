package com.jtc.Hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;




public class HibernateUtil {
	static SessionFactory factory = null;
	static {
		
		AnnotationConfiguration cfg  = new AnnotationConfiguration();
		cfg = (AnnotationConfiguration)cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
		
	}
	
	
	
}
