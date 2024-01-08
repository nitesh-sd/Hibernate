package com.jtcindia.Hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name = "myCustomer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private long phone;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY) //, cascade = CascadeType.ALL)
	private Set<Account> accounts;

	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("D.C in customer");
	}

	public Customer(String cname, String email, long phone) {
//		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

//	public Customer(String cname, String email, long phone, Set<Account> accounts) {
//		this.cname = cname;
//		this.email = email;
//		this.phone = phone;
//		this.accounts = accounts;
//	}

//	public Customer(int cid, String cname, String email, int phone, Set<Account> accounts) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.email = email;
//		this.phone = phone;
//		this.accounts = accounts;
//	}

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

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

//	@Override
//	public String toString() {
//		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", accounts="
//				+ accounts + "]";
//	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", accounts="
				+ accounts + "]";
	}
	
	

}
