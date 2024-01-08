package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


public class CurrentStudent extends Student {
	private double feebal;
	private String timing;
	private String trainer;

	public CurrentStudent() {
		System.out.println("Default const in CurrentStudent");
	}

	public CurrentStudent(String sname, String email, int phone, double feebal, String timing, String trainer) {
		super(sname, email, phone);
		this.feebal = feebal;
		this.timing = timing;
		this.trainer = trainer;
	}

	public CurrentStudent(int sid, String sname, String email, int phone, double feebal, String timing, String trainer) {
		super(sid, sname, email, phone);
		this.feebal = feebal;
		this.timing = timing;
		this.trainer = trainer;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "CurrentStudent [feebal=" + feebal + ", timing=" + timing + ", trainer=" + trainer + "]";
	}

}
