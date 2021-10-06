package org.scanner;

import java.util.Scanner;

public class Example_Scanner {

	public static void main(String[] args) {

		System.out.println("Scanner Topic");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of a :");

		int a = input.nextInt();

//		System.out.println("Value of a is :"+a);    

		System.out.println("Enter the value of b :");

		int b = input.nextInt();

		int c = a + b;

		System.out.println("Sum of C :" + c);

		System.out.println("Enter the value of d : ");

		String d = input.next();

		System.out.println("Value of D :" + d);
		
//		System.out.println("Enter string 2 : ");
		
		String f = input.nextLine();
		
//		System.out.println("The string2 : "+f);
		
		System.out.println("Enter string 3 : ");
		
		String g = input.nextLine();
		
		System.out.println("The string2 : "+g);

		
		System.out.println("Enter the value of char");
		
		char e = input.next().charAt(2);
		
		System.out.println("The char is : "+e);
		
		
		       

	}

}
