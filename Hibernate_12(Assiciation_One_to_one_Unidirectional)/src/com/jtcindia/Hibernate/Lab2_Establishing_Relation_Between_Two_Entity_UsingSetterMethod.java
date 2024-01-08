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
			 Address add = new Address("Sector Two", "Noida", "Up");
			 session.save(add);
			 Customer cust = new Customer("som","Som@jtc",12345);
			 session.save(cust);
			 cust.setAddress(add);
			 tx.commit();
			 session.close();
		 }catch(Exception e) {
			 tx.rollback();
			 e.printStackTrace();
		 }
	}
}
	

