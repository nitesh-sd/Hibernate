package com.jtcindia.Hibernate_7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client4_Deleting {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			//Stud stu = session.load(Student.class, 1);
			Student stu = session.get(Student.class, 1);
			if(stu != null)
				session.delete(stu);
			else {
				System.out.println("oops - No Student Found");
				
			}
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
