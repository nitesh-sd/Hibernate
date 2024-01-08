package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab6_Fetching_the_address_with_cid {
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);

			Address add = cust.getAddress();
			System.out.println(add);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
