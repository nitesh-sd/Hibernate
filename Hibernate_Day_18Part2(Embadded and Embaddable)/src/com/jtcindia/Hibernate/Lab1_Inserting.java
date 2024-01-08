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
			Address add = new Address("sector-2","Noida","UP");
			Customer cust = new Customer("jtc","jtc@.co", 12365, add);
			session.save(cust);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
