package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "myaddress")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addid")
	private int addid;
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
	private Customer customer;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Address(int addid, String street, String city, String state) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	

	public Address(int addid, String street, String city, String state, Customer customer) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.customer = customer;
	}
	

	public Address(String street, String city, String state, Customer customer) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.customer = customer;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + ", state=" + state + ", customer="
				+ customer + "]";
	}

	

}
