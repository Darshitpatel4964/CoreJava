/**
 * Write a program to demonstrate the example of a break statement. 
 * E.g. Use the loop for 10 numbers and stop the execution after 7 numbers. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class BreakStatement {

    public static void main(String[] args) {
    	// Using for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break; // Breaking for loop
            }
            System.out.println(i);
        }
    }

}
