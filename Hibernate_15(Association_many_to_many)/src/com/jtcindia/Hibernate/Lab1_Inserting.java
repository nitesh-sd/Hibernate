package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1_Inserting {
	public static void main(String[] args) {
		Transaction tx = null;
		try{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student stu1 = new Student("som","som@cc.com", 12345);
			session.save(stu1);
			
			Student stu2 = new Student("aa","aa@cc.com", 78655);
			session.save(stu2);
			
			Student stu3 = new Student("rai","rai@cc.com", 645321);
			session.save(stu3);
			
			Course cou1 = new Course("Java",10000, "somprakash");
			session.save(cou1);
			
			Course cou2 = new Course("Hibernate",20000, "vivekSareen");
			session.save(cou2);
			
			Course cou3 = new Course("SpringBoot",15000, "RajivRanjan");
			session.save(cou3);
			
			tx.commit();
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}

	}

}
