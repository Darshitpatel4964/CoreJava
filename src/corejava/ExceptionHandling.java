package corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program to read the data from a myTestFile file using exception handling.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class ExceptionHandling {

    public static void main(String[] args) {
        String filePath = "D://myTestFile.txt";
        String contents = fileToString(filePath);
        System.out.println(contents);
    }

    private static String fileToString(String filePath) {
        StringBuilder stringBuilder = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            stringBuilder = new StringBuilder();
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                stringBuilder.append(currentLine);
                stringBuilder.append("\n");
            }

        } catch (FileNotFoundException ex1) {
            ex1.printStackTrace();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

}
