package com.jtcindia.Hibernate_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client_1_Inserting {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session	session = sessionFactory.openSession();
			tx = session.beginTransaction();
			String courses[] = {"Hibernate","Spring","Spring Boot","Angular"};
			List<String> skills = new ArrayList<>();
			skills.add("Java8");
			skills.add("JDBC");
			skills.add("Servlets");
			skills.add("JSP");
			
			List<Integer> marks = new ArrayList<>();
			marks.add(80);
			marks.add(85);
			marks.add(88);
			marks.add(92);
			
			Set<String> interviews = new HashSet<>();
			interviews.add("Infosys");
			interviews.add("TCS");
			interviews.add("Google");
			interviews.add("Amazone");
			
			Map<String,Integer>refs = new HashMap<>();
			refs.put("AA", 11);
			refs.put("BB", 22);
			refs.put("CC", 33);
			refs.put("DD", 44);
			
			Student stu = new Student("Som","som@jtc",12345);
			stu.setCourses(courses);
			stu.setSkills(skills);
			stu.setMarks(marks);
			stu.setInterviews(interviews);
			stu.setRefs(refs);
			session.save(stu);
			tx.commit();
			session.close();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
