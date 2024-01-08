package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2_Fetching {
	public static void main(String[] args) {
		Transaction tx = null;
	try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust.getCid());
			System.out.println(cust.getCname());
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
