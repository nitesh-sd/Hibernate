package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2_Establishing_Relation_Between_Two_Entity_UsingSetterMethod {


	public static void main(String[] args) {
		 Transaction tx = null;
		 try {
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			 Session session = sessionFactory.openSession();
			 tx = session.beginTransaction();
		//1. provided both Customer info and Address info
			 
			 Customer cust = new Customer("Prakash","Som@jtc",12345);
			 session.save(cust);
			 
			 Account acc1 = new Account("Sector Two", "BC-101", 25000);
			 session.save(acc1);
			 acc1.setCustomer(cust);
			 
			 Account acc2 = new Account("Sector Three", "BC-102", 60000);
			 session.save(acc2);
			 acc2.setCustomer(cust);
			 
			 tx.commit();
			 session.close();
		 }catch(Exception e) {
			 tx.rollback();
			 e.printStackTrace();
		 }
	}
}
	

