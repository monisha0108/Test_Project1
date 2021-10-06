package org.keyword;

public class Example1 {

	static int c = 50;

	int b = 20;

	public void tamil() {
		System.out.println("Language 1 : Tamil");

		int a = 10;

		System.out.println("Value of A : " + a);
	}

	public void english() {
		System.out.println("Language 2 : English");
		System.out.println("Value of B : " + b);
	}

	public static void maths() {
		System.out.println("Language 3 : Maths");

		int d = 20 + c;
		System.out.println("Value of D : " + d);

	}

	public final void science() {
		System.out.println("Language 4 : Science");

		this.tamil();
	}

	public int history() {
		System.out.println("Language 5 : History");

		int c = 20 + 20;

		return c;
		

	}

	public static void main(String[] args) {
		System.out.println("List of Language ");

		Example1 obj1 = new Example1();
		obj1.science();
		obj1.english();
		maths();
		System.out.println(obj1.history());
		
	}

}
