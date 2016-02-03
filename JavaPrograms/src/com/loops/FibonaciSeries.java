package com.loops;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.print("Enter number upto which Fibonacci series to print: ");
		
		
		Fib f = new Fib();
		int r = f.FibMethod(num1);
		System.out.print("The series is " + r);
		
		
		scan.close();
	}
	
}
		
