package com.loops;

import java.util.Scanner;

public class Factorial {

		public static void main(String[] args){

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number to find Factorial");
			int a = scan.nextInt();
	
			FactClass f = new FactClass();
			int r = f.fact(a);
			
			System.out.println("The Factorial of "+ a + " is "+ r);
			
			scan.close(); 
		}

}




