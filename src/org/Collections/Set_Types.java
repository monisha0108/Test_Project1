package org.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Types {

	public static void main(String[] args) {
		System.out.println("Set And Its Types");
		System.out.println(" ");

		System.out.println("1.Hashset:");

		Set<Object> li = new HashSet<Object>();
		li.add("Tamil");
		li.add("English");
		li.add("French");
		li.add("Urudu");
		li.add("Tamil");
		li.add("S");
		li.add(852);
		li.add(false);
		li.add(1);
		li.add("s");
		li.add("s");

		System.out.println(li);

		System.out.println("2.LinkedHashset:");

		Set<Object> li1 = new LinkedHashSet<Object>();

		li1.add("Tamil");
		li1.add("English");
		li1.add("French");
		li1.add("Urudu");
		li1.add("Tamil");
		li1.add("S");
		li1.add(852);
		li1.add(false);
		li1.add(1);
		li1.add("s");
		li1.add("s");

		System.out.println(li1);

		System.out.println("3.Treeset");

		Set<Object> li2 = new TreeSet<Object>();

		li2.add("Tamil");
		li2.add("English");
		li2.add("French");
		li2.add("Urudu");
		li2.add("Tamil");
		li2.add("S");
		
		System.out.println(li2);

	}

}
