package com.Strings;

import java.io.UnsupportedEncodingException;

public class ReverseString {

	public static void main(String[] args) {
	
		  
			 
			String s1="ABCDEFG";  
			byte[] barr = null;
			try {
				barr = s1.getBytes(s1);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<barr.length;i++){  
			System.out.println(barr[i]);  
			}  
			
		 
		

			}

}
