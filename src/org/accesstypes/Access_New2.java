package org.accesstypes;

public class Access_New2 extends Access_New1 {
	public static void main(String[] args) {
		System.out.println("Detailed Accessed");
		
		Access_New1 v1 = new Access_New1();
		
		Access_New2 v2 = new Access_New2();
		v1.bike();
		v2.bike();
		v1.cycle();
		v2.cycle();
		v1.van();
		v2.van();
		
	}
	

}
