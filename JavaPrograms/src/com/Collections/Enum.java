//f. Write a program that defines an enum having months of the year and then 
// prints the value of all the enum elements.

package com.Collections;

public class Enum {
	
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		
		for(Month m : Month.values())
			System.out.println(m);
	}

}
