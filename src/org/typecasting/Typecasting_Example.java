package org.typecasting;

public class Typecasting_Example {

	public static void main(String[] args) {

		System.out.println("Widening Typecasting");

		byte a = 5;

		short b = a;

		int c = b;

		long d = c;

		float e = d;

		double f = e;

		System.out.println("Value of A : " + a);

		System.out.println("Value of B : " + b);

		System.out.println("Value of C : " + c);

		System.out.println("Value of D : " + d);

		System.out.println("Value of E : " + e);

		System.out.println("Value of f : " + f);

		System.out.println("Narrowing Casting");

		double g = 5.1;

		float h = (float) g;

		long i = (long) h;

		int j = (int) i;

		char k = (char) j;

		short l = (short) k;

		byte m = (byte) l;

		System.out.println("Value of G : " + g);

		System.out.println("Value of H : " + h);

		System.out.println("Value of I : " + i);

		System.out.println("Value of J : " + j);

		System.out.println("Value of K : " + k);

		System.out.println("Value of L : " + l);

		System.out.println("Value of M : " + m);

	}

}
