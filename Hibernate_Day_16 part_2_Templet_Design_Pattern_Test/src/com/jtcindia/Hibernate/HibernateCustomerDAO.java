package com.jtcindia.Hibernate;

//50:34
public class HibernateCustomerDAO implements CustomerDAO {

	HibernateTemplate htemp = new HibernateTemplate();
	public HibernateCustomerDAO() {
		System.out.println("Default construc in HibernateCustomerDAO");

	}
	public HibernateCustomerDAO(HibernateTemplate htemp) {
		System.out.println("HibernateTemplet htemp");
		this.htemp = htemp;
	}

	@Override
	public void addCustomer(Customer cto) {
		Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
				cto.getBalance(), cto.getStatus());
		htemp.save(cust);
	}

	@Override
	public void updateCustomer(Customer cto) {
		Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
				cto.getBalance(), cto.getStatus());
		htemp.update(cust);

	}

	@Override
	public void deleteCustomer(int cid) {
		htemp.delete(Customer.class, cid);

	}

	@Override
	public Customer getCustomerByCid(int cid) {
			Customer cust = (Customer)htemp.load(Customer.class, cid);
			Customer cto = new Customer(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity(),
					cust.getBalance(), cust.getStatus());
			

		return cto;
	}
	

}
