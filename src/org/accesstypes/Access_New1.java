package org.accesstypes;

public class Access_New1 {
	
	public static void main(String[] args) {
		System.out.println("Vechicle Details");
		
		Access_New1 vec1 = new Access_New1();
		vec1.car();
		vec1.bike();
		vec1.van();
		vec1.cycle();
		
	}
	
	private void car() {
System.out.println("Car");
	}
	
	public void bike() {
System.out.println("Bike");
	}
	
	 void van() {
System.out.println("Van");
	}
	 
	 protected void cycle() {
System.out.println("cycle");
	}

}
