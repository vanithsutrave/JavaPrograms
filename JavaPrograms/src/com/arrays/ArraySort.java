//e. Write a program to sort an array.

package com.arrays;

public class ArraySort {

	public static void main(String[] args) {
	
		
		int[] arr = {23, 46, 12, 87, 45, 9};
		
		
		
		for(int x : arr){
		
			if(arr[x] < arr[x+1]){
				x = arr[x];
			}
			System.out.println(arr[x]);
		}
		
	}

}



	


