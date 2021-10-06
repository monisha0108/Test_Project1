package org.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Program {

	public static void main(String[] args) {
		System.out.println("Map Methods");
		Map<Integer, String> ma = new HashMap<Integer, String>();
		ma.put(1,"List");
		ma.put(2, "Set");
		ma.put(3, "Map");
	
		System.out.println(ma);
		
		int size = ma.size();
		System.out.println("Size is : "+size);
	    
		String integer = ma.get(3);
		System.out.println("Get is : "+integer);
		
		Set<Integer> KeySet = ma.keySet();
		System.out.println("KeySet is : "+KeySet);
		
		Collection<String> values = ma.values();
		System.out.println("Values is : "+values);
		
		boolean containskey = ma.containsKey(4);
		System.out.println("ContainsKey is : "+containskey);
		
		boolean containsvalue = ma.containsValue("List");
		System.out.println("ContainsValue is : "+containsvalue);
		
		Set<Entry<Integer, String>> entryset = ma.entrySet();
		System.out.println("HashMap into Set Format is : "+entryset);



	
	}
}
