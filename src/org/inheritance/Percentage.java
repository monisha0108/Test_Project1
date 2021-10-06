package org.inheritance;

public class Percentage extends Language {
	public static void main(String[] args) {
		System.out.println("Student Percentage");

		Percentage obj2 = new Percentage();
		obj2.Language1();
		obj2.Language2();
		obj2.Language3();
		obj2.English();
		obj2.Tamil();
		obj2.Maths();
		
		
	}

	public void English() {
		System.out.println("60%");
	}

	public void Tamil() {
		System.out.println("70%");
	}

	public void Maths() {
		System.out.println("80%");
	}
}
