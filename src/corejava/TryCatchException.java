package corejava;

/**
 *  Write a program to handle exceptions using throws keywords.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class TryCatchException {

    public static void main(String[] args) {
        try {
            int data = 60 / 0; // Throw exception
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest Of Code");
    }

}
