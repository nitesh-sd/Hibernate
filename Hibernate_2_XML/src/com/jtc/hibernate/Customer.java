package com.jtc.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private String city;
	private double bal;
	
	public Customer() {
		System.out.println("Default Constructor in Customer");
	}
	
	public Customer(String cname, String email, long phone, String city, double bal) {
		System.out.println("para constr in customer");
		//this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
}

//We can define the HibernateUtile class inside Customer.java file, if we want to create a saperate file then we can make it.

/*
 * class HibernateUtil { static SessionFactory factory=null; static {
 * 
 * Configuration cfg = new Configuration(); cfg =
 * cfg.configure("hibernate.cfg.xml"); factory = cfg.buildSessionFactory(); }
 * public static SessionFactory getSessionFactory() {
 * System.out.println("Session factory in HibernateUtil class"); return factory;
 * 
 * }
 * 
 * 
 * 
 * }
 */


