package com.session1;

public class CustomerMainApp { // Execution Logic Class
	public static void main(String[] args) {
		System.out.println("I am from Main Method");
		Customer customer = new Customer();
		System.out.println(customer);
		customer.displayCustomerDetails();
		customer.customerId = 111;
		customer.customerName = "Jay";
		customer.customerCity = "Dallas";
		// customer.customerPassword = "Abc@123"; // since it is private, can't
		// access outside class
		customer.displayCustomerDetails();

		Customer customer1 = new Customer();
		System.out.println(customer1);
		customer1.customerId = 112;
		customer1.customerName = "JP";
		customer1.customerCity = "San Antonio";
		// customer.customerPassword = "Abc@123"; // since it is private, can't
		// access outside class
		customer1.setCustomerPassword("Abc@123");
		System.out.println(customer1.getCustomerPassword());
		customer1.displayCustomerDetails();

		System.out.println("End of Main Method");
	}

}
