package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.nio.file.Files;
import java.nio.file.Paths;

public class StringHandaling {

	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

	public static void main(String[] args) throws Exception {
		String data = readFileAsString("D://myTestFile.txt");
		System.out.println(data);
	}
}
