package com.jtcindia.Hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab6_Fetching_Student_through_Course {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Course cou = session.load(Course.class, 1);
			System.out.println(cou);
			Set<Student> stus = cou.getStudents();
			for(Student stu : stus)
				System.out.println(stu);
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
