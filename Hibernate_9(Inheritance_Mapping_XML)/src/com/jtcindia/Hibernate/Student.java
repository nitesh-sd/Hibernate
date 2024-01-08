package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


public class Student {

	private int sid;
	private String sname;
	private String email;
	private int phone;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}	
	
	public Student(String sname, String email, int phone) {
		super();
		//this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	
	public Student(int sid, String sname, String email, int phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
