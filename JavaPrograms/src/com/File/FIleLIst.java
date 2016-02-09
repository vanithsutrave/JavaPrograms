//Write a program to show list of all file names in a folder.

package com.File;

import java.io.File;

public class FIleLIst {

	public static void main(String[] args) {
		
		File file = new File("/home/vjvanviy/workspace/JavaLessons/src/Lessons");
		
		String[] s = file.list();
		
		for(String list : s){
			System.out.println(list);
		}
	}

}
