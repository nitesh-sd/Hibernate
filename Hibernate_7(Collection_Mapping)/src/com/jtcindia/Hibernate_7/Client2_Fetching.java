package com.jtcindia.Hibernate_7;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2_Fetching {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Student stu = session.load(Student.class, 1);
			System.out.println(stu.getSname() + "\t" + stu.getPhone());
			String cous[] = stu.getCourses();
			for(String mycou : cous) {
				System.out.println(mycou);
			}
			List<String> myskills = stu.getSkills();
			System.out.println("Skills" + myskills);
			List<Integer> mymarks = stu.getMarks();
			System.out.println("Mark" + mymarks);
			Set<String> myinterviews = stu.getInterviews();
			Map<String,Integer> myrefs = stu.getRefs();
			System.out.println("Ref" + myrefs);
			tx.commit();
			session.close();
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
}
}
