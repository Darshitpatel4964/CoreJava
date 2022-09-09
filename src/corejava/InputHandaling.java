import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program to read the data from a myTestFile file using input handling.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class InputHandaling {

    public static void main(String[] args) throws FileNotFoundException {
        File readFile = new File("D://myTestFile.txt");
        Scanner scanner = new Scanner(readFile);

        // We just need to use \\Z as delimiter
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());
    }

}
