package org.Constructor;

public class Costructor_Example1 {

	public Costructor_Example1() {

		System.out.println("A default constructor");
	}

	public Costructor_Example1(String name, int id) {

		System.out.println("Perameterized Constructor");

		System.out.println(name + " " + id);
	}

	public static void main(String[] args) {

		System.out.println("Constructor");

		Costructor_Example1 obj = new Costructor_Example1();

		Costructor_Example1 obj1 = new Costructor_Example1("Monisha", 5334);
	}

}
