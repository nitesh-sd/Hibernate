package com.jtcindia.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3_Updating {
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			Student stu = new Student("dd","dd@jtc.com",7362521);
			session.save(stu);
			Course cou = session.load(Course.class, 3);
			Set<Course> cous = new HashSet<>();
			cous.add(cou);
			stu.setCourses(cous);
			tx.commit();
						
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			
			// TODO: handle exception
		}finally {
			if (session !=null)
				session.close();
		}
	}

}
