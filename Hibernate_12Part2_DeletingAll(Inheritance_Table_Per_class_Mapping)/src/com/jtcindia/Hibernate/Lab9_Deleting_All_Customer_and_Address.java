package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab9_Deleting_All_Customer_and_Address {
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			session.delete(cust);
	//It will delete the customer data only and the data of address could not deleted.
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}finally {
			if(session != null)
				session.close();
		}
	}
	

}
