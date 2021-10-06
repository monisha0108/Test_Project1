package org.variable.com;

public class Variables1 {

	int b = 10;

	static int e = 5;

	public void addition() {

		int a = 20;
		int c = a + b;
		System.out.println("Value of c :" + c);

	}

	public void subbration() {
		int b = 30;
		int d = b - e;
		System.out.println("Value of d :" + d);
	}

	public static void main(String[] args) {
		System.out.println("Variables");

		Variables1 var = new Variables1();
		var.addition();
		var.subbration();
	}

}
