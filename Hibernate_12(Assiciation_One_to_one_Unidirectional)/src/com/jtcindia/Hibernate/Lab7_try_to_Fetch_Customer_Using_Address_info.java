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
			System.out.println(add);
//In above code we want to fetch the data of customer through address
//Since this code is for one to one unidirectional mapping 
//so here we couldn't fetch the data of Customer
	//we can see this in console	-->	
		/*	Hibernate: select address0_.addid as addid1_0_0_, address0_.city as city2_0_0_, address0_.state as state3_0_0_, address0_.street as street4_0_0_ from myaddress address0_ where address0_.addid=?
					Address [addid=1, street=Sector Two, city=Noida, state=Up]
		
			*/
			// here we couldnt get any data regarding Customer
			// This could happened when we will do two way mapping
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
