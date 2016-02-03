//c. Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and 
// produces output as a1,b1,a2,b2,a3,b3.......,an,bn.

package com.Collections;

import java.util.Arrays;
import java.util.List;

public class Series {

	public static void main(String[] args) {

		String a[] = new String[] { "a1", "a2", "a3", "a4", "a5" };
		String b[] = new String[] { "b1", "b2", "b3", "b4", "b5" };

		List<String> list = Arrays.asList(a);
		List<String> list1 = Arrays.asList(b);

		int s = list.size();

		for (int i = 0; i < s; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(list.get(i));
			System.out.print(",");
			System.out.print(list1.get(i));

		}

	}

}
