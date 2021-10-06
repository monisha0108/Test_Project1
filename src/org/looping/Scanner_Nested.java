package org.looping;

import java.util.Scanner;

public class Scanner_Nested {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Value of A : ");
		int a = obj.nextInt();

		
		System.out.println("Value of B : ");

		int b = obj.nextInt();
	 
		for (int c = 1; c <= a; c++) {
			for (int d = 1; d <= b; d++) {
				System.out.println(c + " " + d);
			}

		}

	}

}
