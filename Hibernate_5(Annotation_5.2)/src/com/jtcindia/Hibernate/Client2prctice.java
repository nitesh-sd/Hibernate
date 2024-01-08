package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2prctice {
	public static void main(String[] args) {
		Transaction txs= null;
		try {
			//1.Set the sessionfactory
			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
			//2.Open the session
			Session session = sessionfactory.openSession();
			//3. Begin Transection
			txs = session.beginTransaction();
			Customer cust = new Customer("Nitesh", "Nkv22@gmail", 528525, "Ranchi");
			session.save(cust);
			txs.commit();
			session.close();
			
		} catch (Exception e) {
			txs.rollback();
			e.printStackTrace();
			
		}
		
	}

}
