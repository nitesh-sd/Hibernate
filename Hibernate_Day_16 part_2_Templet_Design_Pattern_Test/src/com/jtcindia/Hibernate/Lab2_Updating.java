package com.jtcindia.Hibernate;

public class Lab2_Updating {
	public static void main(String[] args) {
		CustomerDAO cdao = DAOFactory.getCustomerDAO();
		Customer cto = new Customer(1,"Nitesh","Nit@jtc",7654,"Gujarat",70000,"Not Active");
		cdao.updateCustomer(cto);
	}
	
}
