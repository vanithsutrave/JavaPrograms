package com.Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String s = "madam";
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		if(s.equals(sb.toString())){
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
		

	}

}
