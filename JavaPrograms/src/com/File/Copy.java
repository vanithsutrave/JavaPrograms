//f. Write a program to copy content of file into another file.

//f. Write a program to copy content of file into another file.

package com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("10lines.txt");

			fos = new FileOutputStream("test.txt");

			int i = 0;
			while ((i = fis.read()) != -1) {
				fos.write((byte) i);
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
