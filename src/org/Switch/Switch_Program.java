package org.Switch;

import java.util.Scanner;

public class Switch_Program {

	public static void main(String[] args) {
		System.out.println("Vowels Task");

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the value :");

		String in = obj.next();

		switch (in) {
		case "a":
			System.out.println("This is a Vowel");
			break;
			
		case "e":
			System.out.println("This is a Vowel");
			break;

		case "i":
			System.out.println("This is a Vowel");
			break;

		case "o":
			System.out.println("This is a Vowel");
			break;

		case "u":
			System.out.println("This is a Vowel");
			break;

		default:
			System.out.println("This is not a vowel");

		}
	}
}
