package com.jtcindia.Hibernate;

public class Client4_Deleting {
	public static void main(String[] args) {
		CustomerDAO cdao = DAOFactory.getCustomerDAO();
		cdao.deleteCustomer(1);
	}

}
