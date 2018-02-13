package com.junit.examples;

public class BasicCalculator {
	public int add(int a, int b) throws NegativeNumberException {
		if (a < 0 || b < 0) {
			throw new NegativeNumberException("Don't Enter Nagative Numbers");
		}
		return a + b;
	}

	public int divide(int a, int b) throws ArithmeticException {
		int c = 0;
		if (b == 0) {
			throw new ArithmeticException("Don't Enter zero in deno");
		}
		c = a / b;
		return c;

	}
}
