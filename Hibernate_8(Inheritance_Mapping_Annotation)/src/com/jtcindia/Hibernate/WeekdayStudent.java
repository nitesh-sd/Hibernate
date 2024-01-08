package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "wdstudents")
@PrimaryKeyJoinColumn(name = "mysid")
public class WeekdayStudent extends CurrentStudent {
	@Column(name = "yop")
	private int yop;
	@Column(name = "percetage")
	private double percentage;
	@Column(name = "qualification")
	private String qualification;
	
	public WeekdayStudent() {
		// TODO Auto-generated constructor stub
	}

	public WeekdayStudent(String sname, String email, int phone, double feebal,String timings, String trainer,int yop, double percentage, String qualification) {
		super(sname,email,phone, feebal, timings, trainer);
		this.yop = yop;
		this.percentage = percentage;
		this.qualification = qualification;
	}
	public WeekdayStudent(int sid, String sname, String email, int phone, double feebal,String timings, String trainer,int yop, double percentage, String qualification) {
		super(sid,sname,email,phone, feebal, timings, trainer);
		this.yop = yop;
		this.percentage = percentage;
		this.qualification = qualification;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "WeekdayStudent [yop=" + yop + ", percentage=" + percentage + ", qualification=" + qualification + "]";
	}
	
	

	

}
