package org.interface_program;

public class Example_Program2_Interface implements Example_Program1_Interface, Example_Program3_Interface {

	@Override
	public void single_inheritance() {
		System.out.println("Single Inheritance : ");
		System.out.println("Properties of one parent class accessed by one child class using extends keyword");
	}

	@Override
	public void multilevel_inheritance() {
		System.out.println("Multilevel Inheritance : ");
		System.out.println("Parent class is accessed by one child class which is already used by one class");
	}

	@Override
	public void hierarchical_inheritance() {
		System.out.println("Hierarchical Inheritance : ");
		System.out.println("One parent class is accessed by more than two child class");
	}

	@Override
	public void multiple_inheritance() {
		System.out.println("Multiple Inheritance : ");
		System.out.println(
				"More than one parent class is accessed by one child class but its not possible in java due to priority issue, its overcome using interface");

	}

	@Override
	public void hybrid_inheritance() {
		System.out.println("Hybrid Inheritance : ");
		System.out.println("combination of single and multiple interface");
	}

	public static void main(String[] args) {
		System.out.println("INHERITANCE");

		Example_Program2_Interface inter = new Example_Program2_Interface();
		inter.single_inheritance();
		inter.multilevel_inheritance();
		inter.hierarchical_inheritance();
		inter.multiple_inheritance();
		inter.hybrid_inheritance();

	}

}
