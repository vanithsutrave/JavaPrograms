package com.loops;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find Factorial");
		int a = scan.nextInt();

		FactClass f = new FactClass();
		int r = f.fact(a);
		
		System.out.println("The Factorial of "+ a + " is "+ r);
		
		scan.close(); 
		
	}		   

	   public static int factorial(int n) {
	       if (n == 0) {
	           return 1;
	       } else {
	           return n * factorial(n - 1);
	       }
	   }
			
}


