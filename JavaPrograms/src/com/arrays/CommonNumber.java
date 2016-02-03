// c. Write a program to find the common number in any given two arrays.

package com.arrays;

public class CommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {10, 20, 30, 40, 78, 34, 25};
		int[] b = {23, 45, 34, 89, 87, 67};
		
		
		
		for(int x = 0; x < a.length; x++){
		
			for(int i = 0; i < b.length; i++){
				if(a[x] == b[i]){
					System.out.println(a[x]);
				} 
			} 
		}
	}
		
}


