//b. Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.


package com.General;

public class PrintNumbers {
	
	public static void main(String[] args) {
		 
		num(1); 
		 
		 }
		
	
		public static void num(int n) 
		{ 
		  if(n <= 10) {
			     
		      System.out.println(n); 
		      
		      num(n+1);
		   }
		}
	 
}
