//b. Write a program to find duplicates in an array using set.

package com.Collections;



import java.util.HashSet;



public class Duplicates {
	
	public static void main(String[] args) {
		
		String[] arr = {"Sam", "Mark", "John", "Chris", "Sam"};
		
		
		HashSet<String> s = new HashSet<String>();
		
		for(String name : arr)
		{
			if(s.add(name)== false) {
				System.out.println(name);
			}
		}
		
	}

}
