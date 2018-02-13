package com.inheritance;

import java.util.Scanner;

public class DynamicBindingExample {
	public static void main(String[] args) {
		System.out.println("I am from main method");
		// As per inheritance, subclass object should be created first
		// But Dynamic bind suggests to create reference of Base Class
		Employee employee = null; // Base class reference
		System.out
				.println("Enter the type of Employee : PermanentEmp or ContractEmployee ");
		Scanner scanner = new Scanner(System.in);
		// System.in represents keyboard
		String empType = scanner.next();
		if ("PermanentEmp".equals(empType)) {
			employee = new PermanentEmp(100, "jay", "Devloper", "Abc@123", 10,
					6000, 2530.25d);
		} else if ("ContractEmployee".equals(empType)) {
			employee = new ContractEmployee(2000, "JP", "Devops", "klm@124",
					30, 780.50f, 24.5f);
		} else {
			System.out.println("Enter the correct type of Employee");
			System.exit(0);// successful Termination of JVM
		}
		employee.doSalaryCalculation(); // Polymorphic method or statement
		employee.displaySalaryStatement();
		employee.setEmpPassword("Admin#123");
		scanner.close();
		System.out.println("End of Main Method");
	}
	/*
	 * Method Call will be resolved by the JVM at teh runtime only, This is
	 * called runtime polymorphism
	 */

}
