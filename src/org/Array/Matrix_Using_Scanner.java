package org.Array;

import java.util.Scanner;

public class Matrix_Using_Scanner {

	public static void main(String[] args) {

		System.out.println("Matrix addition using scanner");

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the rows of first matrix");
		int a = obj.nextInt();

		System.out.println("Enter the coloum of first matrix");
		int b = obj.nextInt();

		System.out.println("Enter the rows of second matrix");
		int c = obj.nextInt();

		System.out.println("Enter the coloum of second matrix");
		int d = obj.nextInt();

		int e[][] = new int[2][2];
		int f[][] = new int[2][2];
		int g[][] = new int[2][2];

		System.out.println("Enter all the elements of first matrix");

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {

				e[i][j] = obj.nextInt();

			}

		}

		System.out.println("Enter all the elements of second matrix:");

		for (int i = 0; i < c; i++) {

			for (int j = 0; j < d; j++) {

				f[i][j] = obj.nextInt();
			}
		}
		System.out.println("First Matrix:");

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				System.out.print(e[i][j] + " ");

			}
			System.out.println("");

		}
		System.out.println("Second Matrix:");

		for (int i = 0; i < c; i++) {

			for (int j = 0; j < d; j++) {
				System.out.print(f[i][j] + " ");

			}
			System.out.println("");

		}

		System.out.println("Matrix after addition:");

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < c; j++) {

				g[i][j] = e[i][j] + f[i][j];

				System.out.print(g[i][j] + " ");

			}
			System.out.println("");
		}
	}
}
