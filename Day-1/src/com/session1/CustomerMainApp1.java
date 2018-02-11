package com.session1;

public class CustomerMainApp1 {
	public static void main(String[] args) {
		System.out.println("I am in Main Method");
		Customer customer = new Customer();
		System.out.println(customer);
		customer.displayCustomerDetails();
		customer.initializeCustomerDetails(101, "jay", "ABC$103", "Austin");
		customer.displayCustomerDetails();

		customer.setCustomerPassword("XYZ@123");
		System.out.println(customer.getCustomerPassword());

		System.out.println("End of main Method");
	}
}
