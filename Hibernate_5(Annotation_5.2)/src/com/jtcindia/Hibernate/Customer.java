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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private long phone;
	@Column(name = "city")
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor in customers");
	}
	
	public Customer(String cname, String email, long phone, String city) {
		
		super();
		System.out.println("Para constructor in Customer");
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
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

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ "]";
	}
	
	
	
	
	
}
