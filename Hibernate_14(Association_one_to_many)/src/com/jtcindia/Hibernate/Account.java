package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "myaccounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accno")
	private int accno;
	@Column(name = "atype")
	private String atpe;
	@Column(name = "bcode")
	private String bcode;
	@Column(name = "bal")
	private double bal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mycid", referencedColumnName = "cid")
	private Customer customer;
	
	public Account() {
		// TODO Auto-generated constructor stub
		System.out.println("DC in accounts");
	}

	
//	public Account(int accno, String atpe, String bcode, double bal, Customer customer) {
//		super();
//		this.accno = accno;
//		this.atpe = atpe;
//		this.bcode = bcode;
//		this.bal = bal;
//		this.customer = customer;
//	}
	
	public Account(String atpe, String bcode, double bal) {
		super();
		this.atpe = atpe;
		this.bcode = bcode;
		this.bal = bal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtpe() {
		return atpe;
	}

	public void setAtpe(String atpe) {
		this.atpe = atpe;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atpe=" + atpe + ", bcode=" + bcode + ", bal=" + bal + ", customer="
		+customer.getCname() + "]";
	}


//	@Override
//	public String toString() {
//		return "Account [accno=" + accno + ", atpe=" + atpe + ", bcode=" + bcode + ", bal=" + bal + ", customer="
//				+ customer + "]";
//	}


	
	

}
