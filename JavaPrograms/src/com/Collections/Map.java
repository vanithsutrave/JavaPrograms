/*d. Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.*/



package com.Collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		
		hm.put(10, "Sarah");
		hm.put(20, "Reena");
		hm.put(40, "Alia");
		hm.put(30, "Becky");
		
		if(hm.containsKey(30)) {
			System.out.println("Value: " + hm.get(30));
		}
	
	}

}
