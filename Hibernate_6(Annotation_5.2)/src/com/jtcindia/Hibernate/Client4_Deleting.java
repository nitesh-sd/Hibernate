package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client4_Deleting {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);
			session.delete(cust);
			tx.commit();
			session.close();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
