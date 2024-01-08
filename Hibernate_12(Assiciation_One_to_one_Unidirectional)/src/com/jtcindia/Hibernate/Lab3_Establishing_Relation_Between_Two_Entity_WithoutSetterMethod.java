package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3_Establishing_Relation_Between_Two_Entity_WithoutSetterMethod {

	public static void main(String[] args) {
		 Transaction tx = null;
		 try {
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			 Session session = sessionFactory.openSession();
			 tx = session.beginTransaction();
		//  provided both Customer info and Address info
			 Address add = new Address("Sector Two", "Noida", "Up");
			 session.save(add);
			 Customer cust = new Customer("som","Som@jtc",12345, add );
			 session.save(cust);
		// cust.setAddress(add);
			 tx.commit();
			 session.close();
		 }catch(Exception e) {
			 tx.rollback();
			 e.printStackTrace();
		 }
	}

}
