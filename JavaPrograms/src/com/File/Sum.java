package com.File;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter the next number");
		int b = scan.nextInt();
		int c = a+b;
		System.out.println("The Sum is : "+ c);
		scan.close();
		
	}

}
