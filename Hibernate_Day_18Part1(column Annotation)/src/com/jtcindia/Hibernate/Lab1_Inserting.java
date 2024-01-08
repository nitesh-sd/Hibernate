package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1_Inserting {
	public static void main(String[] args) {
		Transaction tx = null;
		//after initializing it we can use tx anywhere 
		//If we do not declare it here and declare directly inside the try block then 
		//it will not accessible inside the catch block because local variable cannot be access outside the local context or block
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			
//			Transaction tx = session.beginTransaction();
//			if we use above code here then we are not able to access it inside catch block
			tx = session.beginTransaction();
			Customer cust = new Customer("jtc","jtc@.co", 12365);
			session.save(cust);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
