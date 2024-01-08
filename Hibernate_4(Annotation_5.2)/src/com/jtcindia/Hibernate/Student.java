 package com.jtcindia.Hibernate;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="mystudents")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sid;
	@Column (name = "sname")
	private String sname;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private long phone;
	private String[] course;
	private List<String> skills;
	private List<Integer> marks;
	private Set<String> interview;
	private Map<String, Integer> refs;

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

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getInterview() {
		return interview;
	}

	public void setInterview(Set<String> interview) {
		this.interview = interview;
	}

	public Map<String, Integer> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Integer> refs) {
		this.refs = refs;
	}

}
