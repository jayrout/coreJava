package com.session1;

public class DefaultValuesDemo {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean b1;
	String s1;
	Object o;

	public void KnowYourDefaultValue() {
		System.out.println("byte" + "\t" + b);
		System.out.println("short" + "\t" + s);
		System.out.println("int" + "\t" + i);
		System.out.println("Long" + "\t" + l);
		System.out.println("float" + "\t" + f);
		System.out.println("double" + "\t" + d);
		System.out.println("char" + "\t" + c);
		System.out.println("boolean" + "\t" + b1);
		System.out.println("String" + "\t" + s1);
		System.out.println("Object" + "\t" + o);

	}

	public static void main(String[] args) {
		System.out.println("I am from Main Method");
		DefaultValuesDemo demo = new DefaultValuesDemo();
		System.out.println(demo);
		demo.KnowYourDefaultValue();

		System.out.println("End of Main Method");

	}
}
