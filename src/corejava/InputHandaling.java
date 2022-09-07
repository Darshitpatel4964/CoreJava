package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputHandaling {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D://myTestFile.txt");
		Scanner sc = new Scanner(file);

		// we just need to use \\Z as delimiter
		sc.useDelimiter("\\Z");

		System.out.println(sc.next());
	}

}
