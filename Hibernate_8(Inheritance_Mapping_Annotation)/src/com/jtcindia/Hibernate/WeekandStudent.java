package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "wkandstudents")
@PrimaryKeyJoinColumn(name ="mysid")
public class WeekandStudent  extends CurrentStudent{
	@Column(name = "Wesalary")
	private double wesalary;
	@Column(name = "weCompanyName")
	private String wecompanyName;
	@Column(name = "weemail")
	private String weemail;
	
	public WeekandStudent() {
		System.out.println("Default const in WeekandStudent");
	}

	public WeekandStudent(String sname, String email, int phone, double feebal,String timings, String trainer, double wesalary, String wecompanyName, String weemail) {
		super(sname,email,phone, feebal, timings, trainer);
		this.wesalary = wesalary;
		this.wecompanyName = wecompanyName;
		this.weemail = weemail;
	}
	public WeekandStudent(int sid, String sname, String email, int phone, double feebal,String timings, String trainer, double wesalary, String wecompanyName, String weemail) {
		super(sid,sname,email,phone, feebal, timings, trainer);
		this.wesalary = wesalary;
		this.wecompanyName = wecompanyName;
		this.weemail = weemail;
	}

	public double getWesalary() {
		return wesalary;
	}

	public void setWesalary(double wesalary) {
		this.wesalary = wesalary;
	}

	public String getWecompanyName() {
		return wecompanyName;
	}

	public void setWecompanyName(String wecompanyName) {
		this.wecompanyName = wecompanyName;
	}

	public String getWeemail() {
		return weemail;
	}

	public void setWeemail(String weemail) {
		this.weemail = weemail;
	}

	@Override
	public String toString() {
		return "WeekandStudent [wesalary=" + wesalary + ", wecompanyName=" + wecompanyName + ", weemail=" + weemail
				+ "]";
	}
	
}
