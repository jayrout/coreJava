package com.inheritance;

public class InheritanceExampleApp {
	public static void main(String[] args) {
		System.out.println("Main Method start");
		PermanentEmp pEmp = new PermanentEmp(100, "jay", "Devloper", "Abc@123",
				10, 6000, 2530.25d);
		pEmp.doSalaryCalculation();// from subclass
		pEmp.displaySalaryStatement(); // From Subclass PermanentEmployee
		pEmp.setEmpPassword("XYZ@123"); // from superclass Employee
		System.out.println(pEmp.getEmpPassword());

		/*
		 * ContractEmployee contractEmployee = new ContractEmployee(2000, "JP",
		 * "Devops", "klm@124", 30, 780.50f, 24.5f);
		 * contractEmployee.doSalaryCalculation();
		 * contractEmployee.displaySalaryStatement();
		 * contractEmployee.setEmpPassword("XYZ@123");
		 * System.out.println(contractEmployee.getEmpPassword());
		 */
		System.out.println("End of Main");
	}
}
