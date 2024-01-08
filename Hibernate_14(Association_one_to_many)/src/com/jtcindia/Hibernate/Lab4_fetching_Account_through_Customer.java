package com.jtcindia.Hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4_fetching_Account_through_Customer {
	public static void main(String[] args) {

		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);

			Set<Account> accs = cust.getAccounts();
			for (Account acc : accs)
				System.out.println(acc);

			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
