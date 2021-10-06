package org.interface_program;

public class Hybrid_Inheritance extends Example_Program2_Interface{
	
	public void example_1() {
System.out.println("Creating two parent class and accessed by one child class using implements which is called multiple inheritance");
	}
	
	public void example_2() {
System.out.println("One parent class is accessed by one child class is called single inheritance");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Inheritance");
		
		
		Hybrid_Inheritance hybrid = new Hybrid_Inheritance();
		hybrid.single_inheritance();
		hybrid.multilevel_inheritance();
		hybrid.hierarchical_inheritance();
		hybrid.multiple_inheritance();
		hybrid.hybrid_inheritance();
		hybrid.example_1();
		hybrid.example_2();
		
	}

}
