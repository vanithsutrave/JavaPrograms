//b. Write a program to find the missing number in a series of sorted numbers stored in an array

package com.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] a = { 200, 300, 400, 500, 700, 800, 900 };
		int diff = 100; //difference between two numbers in the series 
		int missing = 0;
		
		for (int i = 0; i < (a.length-1); i++) {
			if ( (a[i+1] - a[i]) != diff) {
				missing = (a[i] + a[i+1]) / 2;
				break;
			}
		}

		System.out.println("Missing number in the series is: " + missing);

	}
}
