package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1_Insertion {

	public static void main(String[] args) {
		 Transaction tx = null;
		 try {
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			 Session session = sessionFactory.openSession();
			 tx = session.beginTransaction();
		//1. Save Student - Insert 1 record
			 Student stu = new Student(101,"som","Som@jtc",12345);
			 session.save(stu);
		//2.Save CurrentStudent - Insert 2 records
			 CurrentStudent cstu = new CurrentStudent(102,"aa","aa@jtc",111,5000,"11.00A.M","Som");
			 session.save(cstu);
		//3.Save OldStudent - Insert 2 records			 
			 OldStudent ostu = new OldStudent(103,"bb","bb@jtc",222,99.9,"Google","bb@google.com");
			 session.save(ostu);
		//4. Save WeekdayStudent - Insert 3 record
			 WeekdayStudent wdstu = new WeekdayStudent(104,"cc","cc@jtc",333,9000,"5.00P.M","som",2020,65,"B.Tech");
			 session.save(wdstu);
		//5.Save WeekandStudent - Insert 3 records
			 WeekandStudent westu =new WeekandStudent(105,"dd","dd@jtc",444,7500,"7:30 A.M", "prakash", 19,"TCS","dd@tcs.com");
			 session.save(westu);
			 tx.commit();
			 session.close();
		 }catch(Exception e) {
			 tx.rollback();
			 e.printStackTrace();
		 }
	}
}



//For mannual insertion if we do not apply identity , the AUTO , IDENTITY, TABLE or SEQUENCE 

//public class Lab1_Insertion {
//
//	public static void main(String[] args) {
//		 Transaction tx = null;
//		 try {
//			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//			 Session session = sessionFactory.openSession();
//			 tx = session.beginTransaction();
//		//1. Save Student - Insert 1 record
//			 Student stu = new Student(101,"som","Som@jtc",12345);
//			 session.save(stu);
//		//2.Save CurrentStudent - Insert 2 records
//			 CurrentStudent cstu = new CurrentStudent(102,"aa","aa@jtc",111,5000,"11.00A.M","Som");
//			 session.save(cstu);
//		//3.Save OldStudent - Insert 2 records			 
//			 OldStudent ostu = new OldStudent(103, "bb","bb@jtc",222,99.9,"Google","bb@google.com");
//			 session.save(ostu);
//		//4. Save WeekdayStudent - Insert 3 record
//			 WeekdayStudent wdstu = new WeekdayStudent(104,"cc","cc@jtc",333,9000,"5.00P.M","som",2020,65,"B.Tech");
//			 session.save(wdstu);
//		//5.Save WeekandStudent - Insert 3 records
//			 WeekandStudent westu =new WeekandStudent(105, "dd","dd@jtc",444,7500,"7:30 A.M", "prakash", 19,"TCS","dd@tcs.com");
//			 session.save(westu);
//			 tx.commit();
//			 session.close();
//		 }catch(Exception e) {
//			 tx.rollback();
//			 e.printStackTrace();
//		 }
//	}
//}
