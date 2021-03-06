package com.inheritance;

public class PermanentEmp extends Employee {
	double empBasic;
	double empCommission;
	double takeHomeSalary;

	/**
	 * @param empNumber
	 * @param empname
	 * @param empJob
	 * @param empPassword
	 * @param deptNumber
	 * @param empBasic
	 * @param empCommission
	 */
	public PermanentEmp(int empNumber, String empname, String empJob,
			String empPassword, int deptNumber, double empBasic,
			double empCommission) {
		// super at constructor level
		// if we don't have a parameterized constructor, it would show
		// compilation error as there is no default constructor in super class
		super(empNumber, empname, empJob, empPassword, deptNumber);
		System.out.println("From permanent Emp constructor");
		this.empBasic = empBasic;
		this.empCommission = empCommission;
	}

	public void doSalaryCalculation() {
		if (deptNumber == 10) {
			takeHomeSalary = Math.round(empBasic + empBasic * 0.40 + empBasic
					* 0.40 + empCommission);
		} else if (deptNumber == 20) {
			takeHomeSalary = Math.round(empBasic + empBasic * 0.30 + empBasic
					* 0.30 + empCommission);
		} else {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}
	}

	@Override
	public void displaySalaryStatement() {
		// method overriding
		// super at Method Level
		super.displaySalaryStatement();
		System.out.println("Emplyoyee Basic Salary : " + empBasic);
		System.out.println("Emplyoyee Commission : " + empCommission);
		System.out.println("Emplyoyee Take Home Salary : " + takeHomeSalary);
		System.out.println("*************************************************");
	}
}
