package com.jtcindia.Hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static SessionFactory sessionFactory = null;
	static {
		try {
			Configuration cfg = new Configuration();
			Properties myprops = new Properties();
			// this will use to store the value in key and value pair
			myprops.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			myprops.put(Environment.URL, "jdbc:mysql://localhost:3306/jtchdb");
			myprops.put(Environment.USER, "root");
			myprops.put(Environment.PASS, "Nitesh22");
			myprops.put(Environment.POOL_SIZE, "3");
			myprops.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			myprops.put(Environment.SHOW_SQL, "true");
			myprops.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			myprops.put(Environment.HBM2DDL_AUTO, "update");
			cfg.setProperties(myprops);
			cfg.addAnnotatedClass(Customer.class);
			// here we are mapping the resources as we can see in cfg.xml file.
			StandardServiceRegistryBuilder ssrbuilder = new StandardServiceRegistryBuilder();
			ServiceRegistry sr =(ServiceRegistry) ssrbuilder.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(sr);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
