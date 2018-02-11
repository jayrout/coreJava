package com.constructors;

public class Employee {
	int empNumber;
	String empName;
	String empType;
	int empDeptNumber;
	double empBasic;
	private String empPassWord;

	/**
	 * @return the empPassWord
	 */
	public String getEmpPassWord() {
		return empPassWord;
	}

	/**
	 * @param empPassWord
	 *            the empPassWord to set
	 */
	public void setEmpPassWord(String empPassWord) {
		this.empPassWord = empPassWord;
	}

	public Employee() {
		System.out.println("I am from Default constructor");
		empNumber = 111;
		empName = "Jay";
		empType = "Full Time";
		empDeptNumber = 10;
		empBasic = 5000;
		empPassWord = "Abc@123";

	}

	/**
	 * @param empNumber
	 * @param empName
	 * @param empType
	 * @param empDeptNumber
	 * @param empBasic
	 * @param empPassWord
	 */
	public Employee(int empNumber, String empName, String empType,
			int empDeptNumber, double empBasic, String empPassWord) {
		this.empNumber = empNumber; // this keyword at variable level
		this.empName = empName;
		this.empType = empType;
		this.empDeptNumber = empDeptNumber;
		this.empBasic = empBasic;
		this.empPassWord = empPassWord;
	}

	// object parameterized Constructor
	public Employee(Employee tempObject) {
		System.out
				.println("Object Parameterized Constructor/ copy Constructor");
		empNumber = tempObject.empNumber;
		empName = tempObject.empName;
		empType = "Permanent";
		empBasic = tempObject.empBasic + 1500;
		empDeptNumber = tempObject.empDeptNumber;
		empPassWord = tempObject.empPassWord;

	}

	public void displayEmployeeDetails() {
		System.out.println("*************************");
		System.out.println("Employee Number" + "\t" + empNumber);
		System.out.println("Employee Name" + "\t" + empName);
		System.out.println("Employee type" + "\t" + empType);
		System.out.println("Employee Department Number" + "\t" + empDeptNumber);
		System.out.println("Employee Basic" + "\t" + empBasic);

		System.out.println("*************************");

	}
}
