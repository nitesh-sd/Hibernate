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
			 Customer stu = new Customer("som","Som@jtc",12345);
			 session.save(stu);
			 Address add = new Address("Sector Two", "Noida", "Up");
			 session.save(add);
			 tx.commit();
			 session.close();
		 }catch(Exception e) {
			 tx.rollback();
			 e.printStackTrace();
		 }
	}
}


