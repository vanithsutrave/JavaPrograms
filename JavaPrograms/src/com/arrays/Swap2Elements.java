// f. Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
//For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.

package com.arrays;

public class Swap2Elements {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 6, 4 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		for (int m : a) {
			System.out.println(m);
		}

	}

}
