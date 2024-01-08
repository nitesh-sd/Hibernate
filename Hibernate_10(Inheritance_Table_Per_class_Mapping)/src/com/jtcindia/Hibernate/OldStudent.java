package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("OSTU")

public class OldStudent extends Student {
	@Column(name = "osalary")
	private double osalary;
	@Column(name = "ocompanyName")
	private String ocompanyName;
	@Column(name = "oemail")
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
