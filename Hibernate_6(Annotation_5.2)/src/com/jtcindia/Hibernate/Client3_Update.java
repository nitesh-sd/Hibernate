package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client3_Update {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			//we are doing persistence operation here
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);
			cust.setEmail("Som123456@jtc");
			cust.setPhone(987654);
			cust.setCity("Noid");
			session.update(cust);
			tx.commit();
			session.close();			
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
