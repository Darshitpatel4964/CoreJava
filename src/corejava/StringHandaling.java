import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Write a program to read the data from a myTestFile file using string handling.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class StringHandaling {

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception {
        String readStringFile = readFileAsString("D://myTestFile.txt");
        System.out.println(readStringFile);
    }

}