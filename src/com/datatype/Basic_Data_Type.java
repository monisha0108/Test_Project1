package com.datatype;

public class Basic_Data_Type {
	public static void main(String[] args) {

		System.out.println("Basic Data Types");

		char f = 'a';
		System.out.println("Char = " + f);

		Basic_Data_Type obj1 = new Basic_Data_Type();
		obj1.datatype_int();
		obj1.datatype_float();

	}

	public void datatype_int() { // Methods!!

		byte a = 100;

		System.out.println("Byte = " + a);

		short b = 50;
		System.out.println("Short = " + b);

		int c = 20;
		System.out.println("Int = " + c);

		long e = 12345567899l;
		System.out.println("Long = " + e);

	}

	public void datatype_float() {// Methods!!

		float d = 30.1f;
		System.out.println("Float = " + d);

		boolean g = 8 > 8;
		System.out.println("Boolean = " + g);
	}

}
