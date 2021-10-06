package org.scanner;

import java.util.Scanner;

public class Example2_Scanner {

	public static void main(String[] args) {

		System.out.println("Scanner Topic 2");

		Scanner obj = new Scanner(System.in);

		System.out.println("Name of the string-1 : ");

		String a = obj.next();

		System.out.println("The string-1 is : " + a);

//		System.out.println("Enter the next line : ");

		String b = obj.nextLine();

//		System.out.println("The string-2 is"+b);

		System.out.println("Enter the next line : ");

		String c = obj.nextLine();

		System.out.println("The string-3 is " + c);

		System.out.println("Enter the index for String : ");

		int d = obj.nextInt();

		System.out.println("Enter the string");

		char e = obj.next().charAt(d);

		System.out.println("The char is : " + e);

		System.out.println("Enter the boolean :");

		boolean f = obj.nextBoolean();

		System.out.println(f);

	}

}
