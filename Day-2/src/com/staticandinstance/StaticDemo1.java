package com.staticandinstance;

import java.util.Date;

public class StaticDemo1 {
	public void f1() {
		System.out.println("I am from f1 instance Method");
	}

	public void f2() {
		System.out.println("I am from f2 instance method");
		f1(); // Rule 1- we can call one instance method from another instance
				// method using the name directly if they are in the same class
		f3();// Rule4 - Static is already in memory // if in the same class we
				// can directly call otherwise classname.methodname
		double b = Math.round(10.2354d); // rule 4
	}

	public static void f3() {
		System.out.println("I am from f3 static Method");
	}

	// static block executed first
	static {
		System.out.println("I am from static block2");
	}
	static {
		System.out.println("I am from static block");
		Date date = new Date();
		System.out.println(date);
	}

	static {
		System.out.println("I am from static block3");
	}

	// instance block, just braces, we can create multiple instance blocks
	// instance blocks are executed whenever we create an object of the class
	{
		System.out.println("Instance block 2");
	}

	// constructor
	StaticDemo1() {
		System.out.println("I am from default constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Start");
		f3();// Rule 2- we can call one static method from another static method
				// directly in the same class
		// f2(); can't call as static scope and instance scope are different
		StaticDemo1 demo = new StaticDemo1();
		demo.f2(); // Rule 3 , - to call instance method from static method, use
					// object reference
		System.out.println("End of main method");
	}

	{
		System.out.println("Instance block 1");
	}
}
