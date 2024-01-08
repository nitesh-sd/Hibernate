package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2_updating {
	public static void main(String[] args) {
		Transaction tx = null;
	try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			

			tx = session.beginTransaction();
			//Customer cust = new Customer("jtc","jtc@.co", 1265);
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);
			cust.setEmail("Som123456@jtc");
			cust.setPhone(987654);
			session.update(cust);
			
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}


}
