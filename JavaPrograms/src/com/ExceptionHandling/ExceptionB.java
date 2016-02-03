//b. Write a program containing a function which is expected to throw any kind of 
//exception say NullPointerException or ArithmeticException etc and then
//handle this function in the parent function which calls this function



package com.ExceptionHandling;

import java.io.IOException;

public class ExceptionB {
	
		
	public static void example() throws IOException, ArithmeticException {
		
		System.out.println("Possible Exceptions");
		throw new ArithmeticException("Arithmetic Exception is thrown");	
	}
	
	public static void main(String[] args){
		
		try {
			example();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
			e.printStackTrace();
			
				
		} catch (IOException e) {
			System.out.println("IO Exception handled");
			e.printStackTrace();
			
		}
		System.out.println("Rest of the code....");
		
		
		
	}
	

}
