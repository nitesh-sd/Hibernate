package com.jtcindia.Hibernate;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {
	public void save(Object obj) {
		Transaction tx = null;
		Object id = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occur");
			if (tx != null)
				tx.rollback();

		}
	}

	public void update(Object obj) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();

		}
	}

	public void delete(Class myclass, Serializable id) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Object obj = session.load(myclass, id);
			session.delete(obj);

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	public Object load(Class myclass, Serializable id) {
		Object obj = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			obj = session.load(myclass, id, LockMode.READ);
			// obj = session.load(myclass.id);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
		return obj;

	}

}
