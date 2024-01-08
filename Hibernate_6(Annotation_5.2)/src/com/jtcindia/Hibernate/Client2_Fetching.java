package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2_Fetching {
	
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			//Here we can use get also which we see in the upcomming lecture
			System.out.println(cust);
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}

