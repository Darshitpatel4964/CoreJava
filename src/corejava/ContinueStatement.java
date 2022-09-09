/**
 * Write a program to demonstrate the example of a continue statement. 
 * E.g. Use the loop for 10 numbers and continue the execution after 7 numbers. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class ContinueStatement {

    public static void main(String[] args) {
    	for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                // Using continue statement
                continue; // It will skip the rest statement
            }
            System.out.println(i);
        }
    }

}
