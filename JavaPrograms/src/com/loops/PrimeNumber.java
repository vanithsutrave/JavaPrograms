//e. Write a program  to check if a given number is prime or not.

package com.loops;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if its a Prime Number");
		int num = scan.nextInt();
		new PrimeNumber().isPrime(num);
		
		scan.close();
		
	}
		
		
	
	public boolean isPrime(int num){
		for(int i = 2; i <= num/2; i++){
			if(num % i == 0){
			System.out.println(num + " is not a Prime Number");
			return false;
			}
		}
		System.out.println(num + " is a Prime Number");
		return true;
	}
	
}



