package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1_Insertion {

	public static void main(String[] args) {
		 Transaction tx = null;
		 try {
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			 Session session = sessionFactory.openSession();
			 tx = session.beginTransaction();
		//1. Save Customer - Insert 1 record
			 
			 Customer cust = new Customer("som","Rai@jtc",12345);
			 session.save(cust);
			 
//			 Account acc1 = new Account("SA","BC-101", 25000);
//			 session.save(acc1);
//			 Account acc2 = new Account("SA","BC-102", 5000);
//			 session.save(acc2);
			 
			 
			 tx.commit();
			 session.close();
		 }catch(Exception e) {
			 tx.rollback();
			 e.printStackTrace();
		 }
	}
}


