// c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".

package com.Strings;

public class Append {
	
	public static void main(String[] args) {
		
	
		int count = 1;
		String s = "This is nice";
		
		String a[] = s.split(" ");
		
		for(String m : a){
			System.out.print(m + count++ + " ");
		}
	
	}


}
