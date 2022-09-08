 package corejava;

/**
 * Write a program to demonstrate the use of do while loop. 
 * (E.g print 1 to 10 numbers).
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

}
