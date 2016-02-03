
//a. Write a program that is expected to throw a 
//null pointer exception and in turn handles it using try catch and finally.

package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		Integer b = scan.nextInt();
		
	
		Integer a = null;
	
		try{
		Integer c = a/b;
		System.out.println(c);
		}
		catch(NullPointerException e) {
			System.out.println("Exception Handled");
		}
		finally{
			scan.close();
			System.out.println("finally will always run");	
		}
	}

}
