package com.jtcindia.Hibernate;

public class Client3_Fetching {
	public static void main(String[] args) {
		
	
	CustomerDAO cdao = DAOFactory.getCustomerDAO();
	CustomerTO cto = cdao.getCustomerByCid(1);
	// we can fetch it with n number of terms like we can fetch it with cname, city etc
//	CustomerTO cto = cdao.getCustomerByCname("Nitesh"); //fetching with cname
	System.out.println(cto);
	// whenever we are not writing the main method we will not get the 
	// the suggestion option for sop statement.
	}
}
