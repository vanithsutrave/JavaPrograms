package com.loops;

public class Fib {

		
		public int FibMethod(int num1){
			if(num1 > 0){
				num1++;
			}
			
			int fib1 = 0;
			int fib2 = 1;
			int fib3 = 1;
			
			
			
			while(fib3 > fib1){
			fib1 = fib1 + fib2;
			fib3 = fib1 + fib2;
			System.out.println(fib3);
			}
		
			return num1;

	}
	
}






