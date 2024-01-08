package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
	public static void main(String[] args) {
		Transaction txs = null;
		// step-1: Set the SessionFactory
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		//Step-2: Open the Session
			Session session= sessionFactory.openSession();
		//Step-3: Begin the Transaction
			txs = session.beginTransaction();
		//Step-4: Perform your operation
			Customer cust = new Customer("som", "s@gmail", 34567, "Noida");
			session.save(cust); // this one is called persistence operation , because it save that data and generate the query
		//Step-5: End the transaction
			txs.commit();
		//Step-6: Close the Session
			session.close();
			
		} catch (Exception e) {
		//Step-7: Roll back if the last transaction not working
			txs.rollback();
			e.printStackTrace();

		}
	}

}
