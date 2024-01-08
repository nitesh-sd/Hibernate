package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myCustomer")
public class Customer {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name ="cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	
	@Column(name = "myemail", length = 10, nullable = true, unique = true, insertable = true, updatable = false)
	private String email;
	
	@Column(name = "myphone", length = 10, nullable = true, unique = false, insertable = true, updatable = true)
	private long phone;
	
	public Customer() {
		
	}

	public Customer(String cname, String email, long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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
