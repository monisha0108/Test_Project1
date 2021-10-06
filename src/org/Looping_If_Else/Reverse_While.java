package org.Looping_If_Else;

import java.util.Scanner;

public class Reverse_While {

	public static void main(String[] args) {

		Scanner rev = new Scanner(System.in);

		System.out.println("Enter any numbers");

		int a = rev.nextInt();

		while (a > 0) {

			int b = a % 10;
			a=a/10;
			System.out.println(b);

		}

	}

}
