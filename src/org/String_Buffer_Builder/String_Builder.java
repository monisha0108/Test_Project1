package org.String_Buffer_Builder;

public class String_Builder {

	public static void main(String[] args) {

		System.out.println("String Builder");

		StringBuilder str = new StringBuilder("Todays Topic Is");

		StringBuilder append = str.append(" String Builder");
		System.out.println("Append is : " + append);

		StringBuilder insert = str.insert(7, "Class Or ");
		System.out.println("Insert is : " + insert);

		StringBuilder replace = str.replace(0, 7, "Tomorrow ");
		System.out.println("Replace is : " + replace);

		StringBuilder delete = str.delete(9, 18);
		System.out.println("Delete is : " + delete);

		String substring = str.substring(25);
		System.out.println("Substring is : " + substring);

		String substring2 = str.substring(0, 15);
		System.out.println("Substring2 is : " + substring2);

		int i = str.length();
		System.out.println("Length is : " + i);

		int j = str.capacity();
		System.out.println("Capacity is : " + j);

		StringBuilder reverse = str.reverse();
		System.out.println("Reverse is : " + reverse);

		char c = str.charAt(0);
		System.out.println("character is : " + c);

	}

}
