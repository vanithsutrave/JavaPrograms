//c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     	//	   --> One Function should swap the numbers without any third new variable.
      	//	 --> Second function should swap the numbers using a third variable.



package com.loops;

public class NumberSwap {

	public static void main(String[] args) {
		
		System.out.println("Original values of n : 10 , m :25");
		
			new NumberSwap().func1();
			new NumberSwap().func2();

	}
	
		int n = 25;
		int m = 10;
		int temp = 0;

		
		
		public void func1(){
			n = n + m ;
			m = n - m;
			n = n - m;
			
			System.out.println("Without any third new variable - " + "m: "+ m + "," +" n: " + n);
		}
		public void func2(){	
			temp = n;
			n = m;
			m = temp;
		
			System.out.println("Using a third variable - " +"m: "+ m + "," +" n: " + n);
	
		}
	
}
