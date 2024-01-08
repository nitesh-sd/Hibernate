package com.jtcindi.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2_Updating_the_data {
		public static void main(String[] args) {
			Transaction tx = null;
			try {
				SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				Session session = sessionFactory.openSession();
				tx = session.beginTransaction();
				Customer cust = session.load(Customer.class, 1);
				System.out.println(cust);
				cust.setEmail("som22@jtc.com");
				tx.commit();
				session.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
