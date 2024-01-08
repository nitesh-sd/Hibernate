package com.jtcindia.Hibernate;

public class DAOFactory {
	static CustomerDAO customerDAO;
	static {
		customerDAO = new HibernateCustomerDAO();
	}
	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
}

//Here we are implementing it in singleton design pattern
//Because the same customerDAO could be implemented in
//n number of places so this DAOFactory will be 
//responsible to give the final implementation of CustomerDAO 
//which has been done by the different clients.