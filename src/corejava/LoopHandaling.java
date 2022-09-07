package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.io.File;
import java.util.Scanner;

public class LoopHandaling {
	public static void main(String[] args) throws Exception {

		// pass the path to the file as a parameter
		File file = new File("D://myTestFile.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}
