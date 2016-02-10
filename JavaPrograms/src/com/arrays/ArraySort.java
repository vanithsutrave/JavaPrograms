//e. Write a program to sort an array.

package com.arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 23, 46, 12, 87, 45, 9 };
		
		/*
		 * Arrays.sort(arr);
		 * 
		 * for(int m : arr){ System.out.print(m + ","); }
		 */

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int k : a) {
			System.out.println(k);

		}

	}

}
