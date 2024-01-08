package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateCustomerDAO implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
					cto.getBalance(), cto.getStatus());
			session.save(cust);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
					cto.getBalance(), cto.getStatus());
			session.update(cust);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, cid);
			session.delete(cust);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		CustomerTO cto = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, cid);
			cto = new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity(),
					cust.getBalance(), cust.getStatus());
			session.save(cust);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

		return cto;
	}

//	@Override
//	public CustomerTO getCustomerByCname(String cname) {
//		// TODO Auto-generated method stub
//		CustomerTO cto = null;
//		Transaction tx = null;
//		try {
//			SessionFactory sf = HibernateUtil.getSessionFactory();
//			Session session = sf.openSession();
//			tx = session.beginTransaction();
//			Customer cust = session.load(Customer.class, cname);
//			cto = new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity(),
//					cust.getBalance(), cust.getStatus());
//			session.save(cust);
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (tx != null)
//				tx.rollback();
//		}
//
//		return cto;
//	}

//	@Override
//	public CustomerTO getCustomerByCname(String cname) {
//		// TODO Auto-generated method stub

}
