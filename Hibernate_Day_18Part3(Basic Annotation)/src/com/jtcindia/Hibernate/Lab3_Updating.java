package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3_Updating {
	public static void main(String[] args) {
		Transaction tx = null;
	try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			

			tx = session.beginTransaction();
			//Customer cust = new Customer("jtc","jtc@.co", 1265);
			Customer cust2 = new Customer("rai","rai@jtc.com",3344);
			
			session.update(cust2);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}


}
