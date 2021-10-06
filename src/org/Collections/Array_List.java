package org.Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {

		System.out.println("Collections Array List :");
		System.out.println("************************");

		List<Object> li = new ArrayList<Object>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add("Array");
		li.add("Vector");
		li.add("Linked");

		System.out.println(li);

		System.out.println(" ");
		System.out.println("List Methods:");
		System.out.println("*************");

		int size = li.size();
		System.out.println("Size = "+size);
		
		
		Object get = li.get(0);
		System.out.println("Get = "+get);
		
		Object set = li.set(2, 40);
		System.out.println(li);
		
		li.remove(3);
		System.out.println(li);
		
		int indexof = li.indexOf(20);
		System.out.println("indexof= "+indexof);
		
		boolean contains = li.contains(20);
		System.out.println("Contains = "+contains);
		
		li.clear();
		System.out.println(li);
		
		boolean addall = li.addAll(li);
		System.out.println(li);
		
		List<Object> obj = new ArrayList<Object>();
		obj.add("moni");
		obj.add(10);
		obj.add(20.1);
		obj.add(3, "nani");
        System.out.println(obj);
        
        obj.addAll(obj);
        System.out.println(obj);

	}

}
