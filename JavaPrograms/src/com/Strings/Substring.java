//b. Write a program to find a substring in a given string and then replace it with another string.


package com.Strings;

public class Substring {

	public static void main(String[] args) {
		
	String s = "Hello World";
	
	//SubString
	boolean s1 = s.contains("World");
	System.out.println(s1);
	
	//Replacement
	String s2 = s.replace("World", "Everyone");
	System.out.println(s2);
	
	}
		
}
