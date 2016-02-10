//g. Write a program  that accepts input from the command line and then prints them.

package com.loops;

public class CommandLineTest {

	public static void main(String[] args) {
		
		int i = 0;
		args[i] = args[0]; 
		System.out.println("Enter an name(argument) in command line");
		
		if(args[0].equals("Sam")) {           
			System.out.println("My name is Sam");
		} else {
			System.out.println("I am someone else.");
		}
	}
}
