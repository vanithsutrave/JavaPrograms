//e. Write a program that contains a constructor, a static block and a static method. 
//Execute the program in order to verify the order to execution of methods and block.

package com.General;

public class Static {

	public static void main(String[] args) {
		
		new Static();
		message();

	}

	public Static() {
		System.out.println("In the constructor");
	}

	public static void message() {
		System.out.println("In the static method");
	}

	static {
		System.out.println("In the static block");
	}
}
