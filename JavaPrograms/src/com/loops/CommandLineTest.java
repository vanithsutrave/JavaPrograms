//g. Write a program  that accepts input from the command line and then prints them.

package com.loops;

public class CommandLineTest {

	public static void main(String[] args) {
		String arg1 = args[0];                     //First command line argument value being set to arg1
		if (arg1.equals("Sam")) {           
			System.out.println("My name is Sam");
		} else {
			System.out.println("I am someone else.");
		}
	}
}
