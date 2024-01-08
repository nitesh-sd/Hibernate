package com.jtcindia.Hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.AttributeAccessor;

@Entity
@Table(name = "myCustomer")
public class Customer {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name ="cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	
	@Column(name = "myemail")
	private String email;
	
	@Column(name = "myphone")
	private long phone;
	
	@Embedded
	@AttributeOverrides({@AttributeOverride(name = "street", column = @Column(name = "mystreet")),
			@AttributeOverride(name = "city", column = @Column(name = "mycity")),
			@AttributeOverride(name = "state",column = @Column(name = "mystate"))})
	private Address address;
	public Customer() {
		
	}

	public Customer(String cname, String email, long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}
	
	

	public Customer(String cname, String email, long phone, Address address) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	

	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}

	
	
}
