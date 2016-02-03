package com.loops;

public class FactClass {
	
	int fact(int a){

		int result= 1;

		for(int x = a; x > 1; x--){
			result = result * x ;
			}
		return result;
	}

}
