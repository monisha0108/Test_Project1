package org.Looping_If_Else;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner whi = new Scanner(System.in);

		int b = 1;

		System.out.println("Enter the number :");

		int c = whi.nextInt();

		int a = 1;

		while (b <= c) {

			a = a * b;
			b++;

		}

		System.out.println("" + a);
	}

}
