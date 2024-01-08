package com.jtcindia.Hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "mystudents")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sid;
	@Column(name = "sname")
	private String sname;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private long phone;
	@ManyToMany //(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "stu_cou", joinColumns = @JoinColumn(name ="mysid",referencedColumnName = "sid"),inverseJoinColumns = @JoinColumn(name ="mycid",referencedColumnName = "cid"))
	private Set<Course> courses;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String sname, String email, long phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}



	public Student(String sname, String email, long phone, Set<Course> courses) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.courses = courses;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}
