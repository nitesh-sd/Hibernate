package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1_Inserting {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
//Step 1 : Get the SessionFactory Object.
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
//Step 2 : Open the Session
			Session session = sessionFactory.openSession();
//Step 3 : Begin Transaction
			tx = session.beginTransaction();
//Step 4 : Do your Operation
			Customer cust = new Customer("som","Web@jtc",2222,"Delhi");
			session.save(cust);
//Step 5 : End txs
			tx.commit();
//Step 6 : Close Session
			session.close();
			
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
