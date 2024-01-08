package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mycustomers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//here Generation type is not auto so we need to pass the cid as well.
	//It will not create a Hibernate sequence.
	@Column(name = "cid")
	//if we write both Annotation and variable at same time 
	//then @Id will not get implemented because Hibernate get confused , 
	//it get confused about that which field is goin to be primary key
	//so we need to write all the java code first then apply the annotation.
	private int cid;
	@Column(name = "cname")
	private String cname;
	@Column(name = "email")
	private String email;
	@Column(name = "Phone")
	private long phone;
	@Column(name = "city")
	private String city;
	@Column(name = "bal")
	private double balance;
	@Column(name = "status")
	private String status;
	
	public Customer() {
		// TODO Auto-generated constructor stub
			System.out.println("Default const in customer");
	}
	
	public Customer(int cid, String cname, String email, long phone, String city, double balance, String status) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.balance = balance;
		this.status = status;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", balance=" + balance + ", status=" + status + "]";
	}
	
	
	
	
	

}
