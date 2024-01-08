package com.jtcindia.Hibernate_7;

import java.util.*;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "mystudent")
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
	private int phone;
	
	
	@ElementCollection
	@CollectionTable(name = "mycourses", joinColumns = @JoinColumn(name = "mysid"))
	@OrderColumn(name = "trainingOrder")
	@Column(name = "CourseName")
	private String[] courses;
	
	@ElementCollection
	@CollectionTable(name = "myskills", joinColumns = @JoinColumn(name = "mysid"))
	@OrderColumn(name = "expertiseOrder")
	@Column(name = "skillName")
	private List<String> skills;
	
	@ElementCollection
	@CollectionTable(name = "mymarks", joinColumns = @JoinColumn(name = "mysid"))
	@Column(name = "marks")
	private List<Integer> marks;
	
	@ElementCollection
	@CollectionTable(name = "myinterviews", joinColumns = @JoinColumn(name = "mysid"))
	@Column(name = "CompanyName")
	private Set<String> interviews;
	
	@ElementCollection
	@CollectionTable(name = "myrefs", joinColumns = @JoinColumn(name = "mysid"))
	@MapKeyColumn(name = "refName")
	@Column(name = "refPhone")
	private Map<String, Integer> refs;
	
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
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
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
	public Set<String> getInterviews() {
		return interviews;
	}
	public void setInterviews(Set<String> interviews) {
		this.interviews = interviews;
	}
	public Map<String, Integer> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Integer> refs) {
		this.refs = refs;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + ", courses="
				+ Arrays.toString(courses) + ", skills=" + skills + ", marks=" + marks + ", interviews=" + interviews
				+ ", refs=" + refs + "]";
	}
		
}
