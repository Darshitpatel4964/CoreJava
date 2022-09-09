/**
 * Write a program to demonstrate the example of the ‘for’ loop and print the pattern.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class ForLoop {

    public static void main(String[] args) {
        int i;
        int j;
        int row = 5;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}