package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1_Inserting {
	public static void main(String[] args) {
		Transaction tx = null;
	try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			
		tx = session.beginTransaction();
			Customer cust = new Customer("jtc","jtc@.co",19282);
			session.save(cust);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}
	}

}
