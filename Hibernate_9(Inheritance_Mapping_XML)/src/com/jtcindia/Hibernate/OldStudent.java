package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


public class OldStudent extends Student {
	private double osalary;
	private String ocompanyName;
	private String oemail;

	public OldStudent() {
		// TODO Auto-generated constructor  
		System.out.println("Def const in OldStudent");
	}

	public OldStudent(String sname, String email, int phone, double osalary, String ocompanyName,String oemail) {
		super(sname, email, phone);
		this.osalary = osalary;
		this.ocompanyName = ocompanyName;
		this.oemail = oemail;		
	}
	public OldStudent(int sid, String sname, String email, int phone, double osalary, String ocompanyName,String oemail) {
		super(sid, sname, email, phone);
		this.osalary = osalary;
		this.ocompanyName = ocompanyName;
		this.oemail = oemail;	
	}

	public double getOsalary() {
		return osalary;
	}

	public void setOsalary(double osalary) {
		this.osalary = osalary;
	}

	public String getOcompanyName() {
		return ocompanyName;
	}

	public void setOcompanyName(String ocompanyName) {
		this.ocompanyName = ocompanyName;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}

	@Override
	public String toString() {
		return "OldStudent [osalary=" + osalary + ", ocompanyName=" + ocompanyName + ", oemail=" + oemail + "]";
	}
	
	
	

}
