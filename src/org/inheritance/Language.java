package org.inheritance;

public class Language  {

	public static void main(String[] args) {
		System.out.println("Student Language");
		
		Language obj1 = new Language();
		obj1.Language1();
		obj1.Language2();
		obj1.Language3();
		
	}

	public void Language1() {
		System.out.println("English");
	}

	public void Language2() {
		System.out.println("Tamil");
	}

	public void Language3() {
		System.out.println("Maths");
	}
}
