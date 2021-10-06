package org.objectcast;

public class Upcasting {
	
	public static void main(String[] args) {
		System.out.println("Upcasting");
		
		Parent1 obj1 = new Parent1();
		obj1.objectcast();
		
		Parent1 obj2 = new Childclass1();
		obj2.objectcast();
		
		Childclass1 obj3 = new Childclass1();
		
				
	}

}
