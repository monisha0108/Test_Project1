package org.String_Function;

public class String_Functions {

	public static void main(String[] args) {
		System.out.println("String Topics");

		String str = new String("Todays Topic Is String");

		int length = str.length();

		boolean equals = str.equals("Todays Topic Is String");

		boolean equalsIgnoreCase = str.equalsIgnoreCase("Todays Topic String");

		String upperCase = str.toUpperCase();

		String lowercase = str.toLowerCase();

		boolean startwith = str.startsWith("Todays");

		boolean endswith = str.endsWith("is");

		int indexof = str.indexOf('T');

		int lastIndexOf = str.lastIndexOf('s');

		char charAt = str.charAt(3);

		String replace = str.replace("is","from");

		boolean contains = str.contains("is");

		String substring = str.substring(5);

		String substring2 = str.substring(8, 15);

		boolean empty = str.isEmpty();

		String trim = str.trim();

		System.out.println("length is " + length);

		System.out.println("Equals is " + equals);

		System.out.println("EqualsIgnoreCase is " + equalsIgnoreCase);

		System.out.println("Uppercase is " + upperCase);

		System.out.println("Lowercase is " + lowercase);

		System.out.println("StartsWith is " + startwith);

		System.out.println("EndsWith is " + endswith);

		System.out.println("indexOf is " + indexof);

		System.out.println("LastIndexOf is " + lastIndexOf);

		System.out.println("CharAt is " + charAt);

		System.out.println("Replace string is " + replace);

		System.out.println("contains or not " + contains);

		System.out.println("Substring is " + substring);

		System.out.println("Substring2 is " + substring2);

		System.out.println("Empty or not is " + empty);

		System.out.println(str);

		System.out.println(trim);

		String[] split = str.split(" ");

		for (String t : split) {

			System.out.println(t);
		}

	}
}
