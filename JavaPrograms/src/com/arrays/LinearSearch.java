// d. Write a program to perform a linear search 
//on any given array.Linear search is the basic search where you look for 
//the element to be searched in a sequential way.

package com.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		 
		
		int[] a = {18, 83, 52, 36, 82};
		
		int findelement = 52;
		
		
		for(int i = 0; i < a.length; i++){
			if (a[i] == findelement){
			System.out.println("Found element: " + findelement);
			break;
			}
			
		}
			
	}

}
