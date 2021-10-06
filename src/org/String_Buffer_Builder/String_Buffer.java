package org.String_Buffer_Builder;

public class String_Buffer {

	public static void main(String[] args) {
		System.out.println("String Buffer");
		
		StringBuffer str = new StringBuffer("Todays Topic Is String ");
		
		StringBuffer append = str.append("Buffer");
		System.out.println("Append is : "+append);
		
		StringBuffer insert = str.insert(7, "Class Or ");
		System.out.println("Insert is : "+insert);
		
		StringBuffer replace = str.replace(0, 6, "Yesterday");
		System.out.println("Replace is : "+replace);
		
		StringBuffer delete = str.delete(9, 18);
		System.out.println("Delete is : "+delete);
		
		String substring = str.substring(19);
		System.out.println("Substring is : "+substring);
		
		String substring2 = str.substring(0, 15);
		System.out.println("Substring2 is : "+substring2);
		
		int i = str.length();
		System.out.println("Length is : " + i);

		int j = str.capacity();
		System.out.println("Capacity is : " + j);

		StringBuffer reverse = str.reverse();
		System.out.println("Reverse is : " + reverse);

		char c = str.charAt(2);
		System.out.println("character is : " + c);





	}
}
