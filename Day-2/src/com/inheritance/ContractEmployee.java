package com.inheritance;

public class ContractEmployee extends Employee {
	float perDaySalary;
	float numberOfDays;
	double takeHomeSalary;

	/**
	 * @param empNumber
	 * @param empname
	 * @param empJob
	 * @param empPassword
	 * @param deptNumber
	 * @param perDaySalary
	 * @param numberOfDays
	 */
	public ContractEmployee(int empNumber, String empname, String empJob,
			String empPassword, int deptNumber, float perDaySalary,
			float numberOfDays) {
		super(empNumber, empname, empJob, empPassword, deptNumber);
		// Super At Constructor Level
		System.out.println("From Contract Employee Constructor");
		this.perDaySalary = perDaySalary;
		this.numberOfDays = numberOfDays;
	}

	public void doSalaryCalculation() {
		if (deptNumber == 10) {
			takeHomeSalary = Math.round(perDaySalary * numberOfDays + 500);
		} else {
			takeHomeSalary = Math.round(perDaySalary * numberOfDays);
		}
	}

	@Override
	public void displaySalaryStatement() {
		// method overriding
		// super at Method Level
		super.displaySalaryStatement();
		System.out.println("Employee perDay Salary : " + perDaySalary);
		System.out.println("Employee Worked Days : " + numberOfDays);
		System.out.println("Employee Take Home Salary : " + takeHomeSalary);
		System.out.println("*************************************************");
	}
}
