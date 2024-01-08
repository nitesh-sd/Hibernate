package com.jtcindia.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2_Linking_Tables {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Course cou1 = new Course("Java", 10000,"somprakash");
			session.save(cou1);
			Course cou2 = new Course("Hibernate 5", 20000,"vivekSareen");
			session.save(cou2);
			Course cou3 = new Course("Spring5", 15000,"RajivRanjan");
			session.save(cou3);
			
			Student stu1 = new Student("Rai","Rai@jtc.com",23145);
			session.save(stu1);			
			Set<Course> cous = new HashSet<>();
			cous.add(cou1);
			cous.add(cou2);
			cous.add(cou3);
			stu1.setCourses(cous);
			
			
			Student stu2 = new Student("aa","aa@cc",54345);
			session.save(stu2);
			cous = new HashSet<>();
			cous.add(cou2);
			cous.add(cou3);
			stu2.setCourses(cous);
			
			Student stu3= new Student("rai","kk@cc",937387);
			session.save(stu3);
			cous = new HashSet<>();
			cous.add(cou1);
			cous.add(cou3);
			stu3.setCourses(cous);
			
			tx.commit();
			session.close();
							
		}catch(Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
		
	}

}
