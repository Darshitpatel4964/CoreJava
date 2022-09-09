/**
 * Write a program og method overloading by using changing the number of data type.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class MethodOl {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(MethodOl.add(12, 12));
        System.out.println(MethodOl.add(15.0, 15.1));
    }

}
