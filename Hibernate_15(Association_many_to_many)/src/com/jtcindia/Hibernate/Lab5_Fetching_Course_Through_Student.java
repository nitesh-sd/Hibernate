package com.jtcindia.Hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5_Fetching_Course_Through_Student {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx =session.beginTransaction();
			Student stu = session.load(Student.class, 2);
			System.out.println(stu);
			Set<Course> cous = stu.getCourses();
			for(Course cou : cous)
				System.out.println(cou);
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
