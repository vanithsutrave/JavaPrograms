package com.arrays;

public class MergeArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };

		int[] merge = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			merge[i] = a[i];
		}

		for (int j = 0; j < a.length; j++) {
			merge[j + a.length] = b[j];
		}

		for (int k : merge) {
			System.out.print(k);
		}
	}
}
