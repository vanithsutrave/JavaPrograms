
// a. Write a program to find the largest number in a given array. 

package com.arrays;

public class LargestElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] a = { 20, 30, 58, 35, 23, 78, 45 };
		new LargestElement().getLargest(a); 				//creates an anonymous instance and invokes the method

	}
	
	public void getLargest(int[] a){
		
		int num = a[0];
		
		for(int i = 1; i < a.length; i++){
			if( a[i] > num){
				num = a[i];
			}
		}
		
		System.out.println("Largest number in array is : " +num);

	}

}
