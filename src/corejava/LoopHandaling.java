import java.io.File;
import java.util.Scanner;

/**
 * Write a program to read the data from a myTestFile file using loop handling.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class LoopHandaling {

    public static void main(String[] args) throws Exception {
        // Pass the path to the file as a parameter
        File loopFile = new File("D://myTestFile.txt");
        Scanner Scanner = new Scanner(loopFile);

        while (Scanner.hasNextLine())
            System.out.println(Scanner.nextLine());
    }

}
