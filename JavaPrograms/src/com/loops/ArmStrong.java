//f. Write a program  to check an armstrong number i.e. whether the if we power up the each 
//individual number to the total number of digits in the number and add them it should be 
//equal to the number itself. For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.

package com.loops;

import java.util.Scanner;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		
	    int c=0,a,temp;  
	    int n=153;            // number to check
	    
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  

}
