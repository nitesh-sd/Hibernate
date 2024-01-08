package com.jtcindia.Hibernate;

public interface CustomerDAO {
	public void addCustomer(Customer cto);
	
	public void updateCustomer(Customer cto);
	
	public void deleteCustomer(int cid);
	
	public Customer getCustomerByCid(int cid);
	
//	public CustomerTO getCustomerByCname(String cname);

}
