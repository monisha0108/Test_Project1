package org.Collections;

import java.util.ArrayList;
import java.util.List;

public class Wrapper_Class {
	
	public static void main(String[] args) {
		System.out.println("Wrapper Types");
		
		List<Integer> obj = new ArrayList<Integer>();
		List<Float> obj1 = new ArrayList<Float>();
		List<Long> obj2 = new ArrayList<Long>();
		List<Double> obj3 = new ArrayList<Double>();
		List<Character> obj4 = new ArrayList<Character>();
		List<Boolean> obj5 = new ArrayList<Boolean>();
		
		obj.add(10);
		obj1.add(02.2f);
		obj2.add(25l);
		obj3.add(55.55d);
		obj4.add('l');
		obj5.add(true);
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);



	}

}
