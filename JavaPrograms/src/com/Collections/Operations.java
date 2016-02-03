/*a. Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator */



package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Operations {
	public static void main(String[] args) {
		
	
		//creating an arraylist and add elements to it.
			
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sam");
		al.add("Heather");
		al.add("Sam");
		al.add("John");
		al.add("Mark");
		
		//searching for an element in the list.
		
		if(al.contains("John")){
			System.out.println("found John");
		}
		
		//printing the elements of the list using iterator.
		
		System.out.println("Traversing elements in forward direction");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//printing the elements in the reverse order using ListIterator
		
		System.out.println("Traversing elements in reverse direction");
		ListIterator<String> ll = al.listIterator();
		
		while(ll.hasNext()) {
			ll.next();
		}
		
		while(ll.hasPrevious()){  
			System.out.println(ll.previous()); 
		}
		
	
	}
	
	
}


