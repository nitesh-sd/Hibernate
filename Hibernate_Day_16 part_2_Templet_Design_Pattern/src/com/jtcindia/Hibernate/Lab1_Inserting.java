package com.jtcindia.Hibernate;

public class Lab1_Inserting {
	public static void main(String[] args) {
		
		
		CustomerDAO cdao = DAOFactory.getCustomerDAO(); //it looks like -->DAOFactory.HibernateCustomerDAO()
		
		//here we are creating a reference variable of CustomerDAO ,We have written DAOFactory.getCustomerDAO() which will connect 
		//the persistence layer to the integration layer ,as a result it will connect the DAOFactory to the CustomerDAO
		//DAOFactory is available inside the Integration layer from which we are calling the CustomerDAO.
		
		CustomerTO cto = new CustomerTO(1,"Rahul","Rahul@jtc",4321,"Delhi",50000,"Active");
		//Here we are inserting the data into the CustomerTO
		//Basically we apply the annotation in the customer class from this class we are not inserting the data
		//we are inserting the data with the help on CustomerTO , where we want the data we can access 
		//it through the customerTO , here we are taking the data from the client side so we are storing the data through this code.
		
		cdao.addCustomer(cto);// It works like -->DAOFactory.HibernateCustomerDAO().addCustomer(cto)
		//DAOFactory.getCustomerDAO().addCustomer(cto); we can write this also which will give us the same result.
		
		//here from cdao reference variable we are calling addCUstomer and DAOFctory by passing the object reference cto  of CustomerTO
		//Now in the first line we are storing the data comming from DAOFactory.getCustomerDAO(); inside the cdao
		//here we are calling DAOFactory.getCustomerDAO(); which will go to DAOFactory and there it find getcustomerDAO method which will store HibernateCustomerDAO instance
		//like --> customerDAO = new HibernateCustomerDAO();
		//Now this will go to HibernateCustomerDAO class (where we implemented CustomerDAO) and call the addCustomer(); method by passing the data of cto. 
		//
		//when we call addCustomer it will call the DAOFActory and DAO Factory will call the HibernateCustomerDAO in which we have writtent the addCustomer method
		//from which we can performe the insertion operation.
	}

}
//Here we are inserting the data. We need to add customer