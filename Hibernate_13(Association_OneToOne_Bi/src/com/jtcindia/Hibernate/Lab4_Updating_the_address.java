package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4_Updating_the_address {
	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			//Not provided address  for this Customer
//			Customer cust = new Customer("aaa","aaa@jtc", 111);
//			session.save(cust);
			
	//Provided Address Later and updating the address of same customer.
			Address add = new Address("Sector 2","Noida","UP");
			session.save(add);
			Customer cust = session.load(Customer.class, 1);
			cust.setAddress(add);
			tx.commit();
			session.close();
		}catch (Exception e ) {
			e.printStackTrace();
		}
	}
	
	public Lab4_Updating_the_address() {
		// TODO Auto-generated constructor stub
	}

}
