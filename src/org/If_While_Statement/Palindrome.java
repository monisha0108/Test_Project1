package org.If_While_Statement;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the number");

		int a = obj.nextInt();
		int b, c = 0;
		int d = a;

		while (d > 0) {
			b = d % 10;
			c = (c * 10) + b;
			d = d / 10;

		}

		if (a == c) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is Not a palindrome");
		}
	}
}
