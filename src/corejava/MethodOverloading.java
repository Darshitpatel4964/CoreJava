/**
 * Write a program of method overloading by using changing the number of arguments.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverloading.add(12, 12));
        System.out.println(MethodOverloading.add(15, 15, 15));
    }

}
