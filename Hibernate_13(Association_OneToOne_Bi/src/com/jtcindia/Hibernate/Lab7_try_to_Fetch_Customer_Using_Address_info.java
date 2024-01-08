package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab7_try_to_Fetch_Customer_Using_Address_info {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Address add = session.load(Address.class, 1);
			System.out.println(add+" Hii");
			
			Customer cust = add.getCustomer();
			System.out.println(cust);
//In above code we want to fetch the data of customer through address
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null)
				session.close();
		}
	}

}
