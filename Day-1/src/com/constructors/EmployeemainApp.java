package com.constructors;

public class EmployeemainApp {
	public static void main(String[] args) {
		System.out.println("I am from Main Method");
		Employee employee = new Employee();
		System.out.println(employee);
		employee.displayEmployeeDetails();

		Employee employee2 = new Employee(); // same
		System.out.println("");
		System.out.println(employee2);
		employee2.displayEmployeeDetails();

		Employee employee3 = new Employee(102, "JP", "Full Time", 12, 6000,
				"anc2123");
		System.out.println(employee3);
		employee3.displayEmployeeDetails();

		Employee employee4 = new Employee(employee3);
		System.out.println(employee4);
		employee4.displayEmployeeDetails();
		System.out.println("End of Main");
	}
}
