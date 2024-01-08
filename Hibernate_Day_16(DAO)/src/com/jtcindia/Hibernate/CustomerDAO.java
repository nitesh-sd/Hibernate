package com.jtcindia.Hibernate;

public interface CustomerDAO {
	public void addCustomer(CustomerTO cto);
	
	public void updateCustomer(CustomerTO cto);
	
	public void deleteCustomer(int cid);
	
	public CustomerTO getCustomerByCid(int cid);
	
//	public CustomerTO getCustomerByCname(String cname);

}
