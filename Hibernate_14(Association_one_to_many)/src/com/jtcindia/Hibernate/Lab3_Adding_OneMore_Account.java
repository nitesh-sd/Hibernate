package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3_Adding_OneMore_Account {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			// provided both Customer info and Address info

			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);

			Account acc1 = new Account("DA", "BC-190", 5000);
			session.save(acc1);
			acc1.setCustomer(cust);
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

}
