//d. Write a program to reverse each individual word in a sentence.

package com.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWords {
	
	public static void main(String[] args) throws IOException { 
		
		
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter string: ");
	        String s = br.readLine();
	        String reverse = "";
	        int length = s.length();

	        for (int i = length - 1; i >= 0; i--)
	            reverse = reverse + s.charAt(i);
	        System.out.println("Result:" + reverse); 
	   	
	}

}
