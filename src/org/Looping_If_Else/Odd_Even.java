package org.Looping_If_Else;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any number :");

		int a = obj.nextInt();

		if (a % 2 == 0) {
			System.out.println("Above number is Even");
		}

		else {
			System.out.println("Above number is Odd");

		}
	}
}
