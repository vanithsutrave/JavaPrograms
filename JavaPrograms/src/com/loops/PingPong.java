/*b. Write a program print "ping" if a number is divisible by 3,"pong" 
 * if a number is divisible by 5, and "ping pong" if number is divisible by both, 
 * else print the number.
 */

package com.loops;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scan.nextInt();
		
		
		PingPong pp = new PingPong();
		pp.printResult(x);
		
		
		scan.close();
	}
	
	public void printResult(int x) {
		if((x%3 == 0)&&(x%5 == 0)) {
			System.out.println("ping pong");
		} else if(x%5 == 0) {
			System.out.println("pong");
		} else if(x%3 == 0) {
			System.out.print("ping");
		} else {
			System.out.println(x);
		}
		
	}
}


					 
		

			