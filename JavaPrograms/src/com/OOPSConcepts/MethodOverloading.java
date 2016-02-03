//d. Write a program to depict the behavior of method overloading and overriding.

package com.OOPSConcepts;

public class MethodOverloading {
	
	
	public void sum(int a , int b) {
		int result = (a + b);
		System.out.println(result);	
	}
	
	public void sum(String c, String d){
		String concat = c + d;
		System.out.println(concat);
	}
	
	public void display() {
		System.out.println("Hello !");
	}
	
	public void display(String name) {
		System.out.println("Hello " + name);
	}

}
