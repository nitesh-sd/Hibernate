package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
	public static void main(String[] args) {
		Transaction txs = null;
		try {
		
		SessionFactory sf = HibernateUtil.getSessionFactory(); 
		Session session = sf.openSession();
		txs = session.beginTransaction();
		Customer cust = new Customer("som","som@gmail",3737,"noida",399337);
		System.out.println("testing Save : " + session.save(cust));
		txs.commit();
		session.close();
		System.out.println("Record Inserted ......");
				
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
