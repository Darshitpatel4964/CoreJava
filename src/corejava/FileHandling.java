package corejava;

import java.io.File;
import java.io.IOException;

/**
 * Write a program to read the data from a myTestFile file using file handling.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class FileHandling {

    public static void main(String[] args) {
        try {
            // Creating an object of a file
            File myObj = new File("D:myTestFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
