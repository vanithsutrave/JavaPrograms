//a. Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.

package com.Strings;

public class ReverseString {

	public static void main(String[] args) {
	
		
		String s = "ABCDEFG";
		
		for(int i = s.length()-1; i >=0; i--){
			char b = s.charAt(i);
			System.out.print(b);
		}
		
		
		
		  
	}
}