//package com.jtcindia.Hibernate;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//public class Lab1_Insertion {
//
//	public static void main(String[] args) {
//		 Transaction tx = null;
//		 try {
//			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//			 Session session = sessionFactory.openSession();
//			 tx = session.beginTransaction();
//		//1. Save Customer - Insert 1 record
//			 Customer stu = new Customer("som","Som@jtc",12345);
//			 session.save(stu);
//			 Address add = new Address("Sector Two", "Noida", "Up");
//			 session.save(add);
//			 tx.commit();
//			 session.close();
//		 }catch(Exception e) {
//			 tx.rollback();
//			 e.printStackTrace();
//		 }
//	}
//}

//After running above code we have to link the customer and the address .
// Now let write the linking code -->

package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5_Linking_Address_with_Customer {
	public static void main(String[] args) {
		Transaction tx = null;
		try {

			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Customer cust = session.load(Customer.class, 1);
			Address add = session.load(Address.class, 1);
			cust.setAddress(add);
			tx.commit();
			session.close();

		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();

		}
	}

}
