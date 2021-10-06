package org.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TypesOfList {
	
	public static void main(String[] args) {
		
		
	System.out.println("Array List :");
	System.out.println("************");
	
	List<Object> li = new ArrayList<Object>();
	     
	System.out.println(li);
	
	System.out.println("Linked List :");
	System.out.println("************");
	
	
	List<Object> li1 = new LinkedList<Object>();
	li1.add("France");
	li1.add("Canada");
	li1.add(0, "India");
	
	System.out.println(li1);
	
	System.out.println("Vector List :");
	System.out.println("************");
	

	List<Object> li2 = new Vector<Object>();
	li2.add("Rupees");
	li2.add("Euro");
	li2.add(2, "CAD");
	
	System.out.println(li2);

	
	}

}
