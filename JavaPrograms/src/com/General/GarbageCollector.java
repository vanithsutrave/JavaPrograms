//c. Write a program implementing explicit garbage collection.

package com.General;

public class GarbageCollector {
	
	public void finalize(){
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
		
		GarbageCollector gc1 = new GarbageCollector();
		GarbageCollector gc2 = new GarbageCollector();
		
		gc1 = null;
		gc2 = null;
		
		System.gc();
	}

}
