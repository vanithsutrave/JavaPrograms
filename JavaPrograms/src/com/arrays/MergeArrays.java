package com.arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };
		
		for(int m : a){
			System.out.print(m);
			for(int i = 0; i < b.length; i++){
				System.out.print(b[i]);
				break;
			}
			
		}

	}

}
