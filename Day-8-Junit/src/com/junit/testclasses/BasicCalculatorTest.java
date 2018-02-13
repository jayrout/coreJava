package com.junit.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.junit.examples.BasicCalculator;
import com.junit.examples.NegativeNumberException;

public class BasicCalculatorTest {

	private static BasicCalculator calculator = null;

	@BeforeClass
	// before execution of each test case test method
	// make it static so it gets created only once for a class
	public static void init() {
		System.out.println("I am from init method");
		calculator = new BasicCalculator();
	}

	// @After if used @after the methods can be instance methods
	@AfterClass
	// methods should static if we are using @beforeClass and @afterClass
	// after execution of test method
	public static void destroy() {
		System.out.println("From Destroy Method");
		calculator = null;

	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd() {
		BasicCalculator calculator = new BasicCalculator();
		try {
			int result = calculator.add(10, 20);
			assertEquals(30, result);
		} catch (NegativeNumberException e) {
			System.out.println("Testadd catch block");
			fail();
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd1() {
		BasicCalculator calculator = new BasicCalculator();
		try {
			int result = calculator.add(-10, 20);
			// assertEquals(30, result);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
			// e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	@Ignore
	// to skip this testCase
	@Test(timeout = 10)
	// if this test case doen't execute in 10 milli sec , the testcase will fail
	public void testAdd2() {
		BasicCalculator calculator = new BasicCalculator();
		try {
			int result = calculator.add(-10, -20);
			// assertEquals(30, result);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
			// e.printStackTrace();
		}
	}

	@Test
	public void testDivide() {
		int result = calculator.divide(10, 20);
		assertEquals(0, result);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivide1() {
		int result = calculator.divide(10, 20);
		assertEquals(0, result);
	}

	@Test()
	public void testDivide2() {
		try {
			int result = calculator.divide(10, 20);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
}
