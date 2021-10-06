package org.Looping_If_Else;

import java.util.Scanner;

public class Blood_Group {
	public static void main(String[] args) {

		Scanner Blood = new Scanner(System.in);

		System.out.println("Enter the value :");

		int a = Blood.nextInt();

		if (a > 10 && a <= 20) {
			System.out.println("Blood group is A+");
		}

		else if (a > 20 && a <= 30) {
			System.out.println("Blood group is A-");
		}

		else if (a > 30 && a <= 40) {
			System.out.println("Blood group is B+");
		}

		else if (a > 30 && a <= 40) {
			System.out.println("Blood group is B+");
		} else if (a > 40 && a <= 50) {
			System.out.println("Blood group is B-");

		} else {
			System.out.println("Invalid Blood Group");
		}

	}

}
