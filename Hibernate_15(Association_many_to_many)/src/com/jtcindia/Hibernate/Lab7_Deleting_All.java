package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab7_Deleting_All {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx= session.beginTransaction();
			Student stu = session.load(Student.class, 1);
			session.delete(stu);
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			// TODO: handle exception
		}
	}

}
