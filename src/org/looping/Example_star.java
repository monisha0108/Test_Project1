package org.looping;

public class Example_star {

	public static void main(String[] args) {

		for (int a = 1; a <= 15; a++) {

			//System.out.println(); 
			{
				for (int b = 1; b <= a; b++)
					System.out.print("1 ");
			}
		}
	}

}
