//g. Write a program to copy arraylist to an array.

package com.Collections;

import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Sam");
		al.add("Heather");
		al.add("Sam");
		al.add("John");
		al.add("Mark");
		

		String[] arr = new String[al.size()];

		arr = al.toArray(arr);
		

		for (String name : arr) {
			System.out.println(name);
		}
	}

}


