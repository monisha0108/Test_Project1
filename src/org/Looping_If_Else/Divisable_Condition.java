package org.Looping_If_Else;

import java.util.Scanner;

public class Divisable_Condition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A:");

		int a = sc.nextInt();

		System.out.println("Enter the value of B:");

		int b = sc.nextInt();

		if (a % b == 0) {

			System.out.println("This number is Divisible");

		}

		else {
			System.out.println("This number is not Divisible");

		}

	}

}
