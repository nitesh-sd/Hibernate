 package com.jtcindia.Hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4_Linking_Course_To_Student {
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			Student stu = session.load(Student.class, 2);
			Course cou = session.load(Course.class, 3);
			Set<Course> cous = stu.getCourses();
			cous.add(cou);
			stu.setCourses(cous);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
			// TODO: handle exception
		}
	}

}
