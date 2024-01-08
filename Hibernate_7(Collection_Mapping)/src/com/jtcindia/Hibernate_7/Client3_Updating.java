package com.jtcindia.Hibernate_7;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client3_Updating {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Student stu = session.load(Student.class, 1);
			//updating the phone number and Email
			stu.setEmail("nkv@jtc");
			stu.setPhone(9876);
			//Updating Marks
			List<Integer> marks = stu.getMarks();
			marks.add(95);
			stu.setMarks(marks); //update
			//updating Interviews
			Set<String> interviews = stu.getInterviews();
			interviews.add("facebook");
			stu.setInterviews(interviews);// update
			//updating Refs
			Map<String,Integer> refs = stu.getRefs();
			refs.put("EE", 55);
			stu.setRefs(refs); //update
			tx.commit();
			session.close();	
			
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
