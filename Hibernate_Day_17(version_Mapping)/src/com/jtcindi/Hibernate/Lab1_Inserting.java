package com.jtcindi.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1_Inserting {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("som", "som@jtc.com",333);
			session.save(cust);
			tx.commit();
			session.close();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}
	}

}

//here we are not providing any value related to the version
