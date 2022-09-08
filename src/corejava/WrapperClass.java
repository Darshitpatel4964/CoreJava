package corejava;

/**
 * Create a program to compare two variables of Wrapper class using Wrapper classes.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class WrapperClass {

    public static void main(String args[]) {
        byte byteOne = 10;
        int intOne = 30;

        // Autoboxing: Converting primitives into objects  
        Byte byteobj = byteOne;
        Integer intobj = intOne;

        // Printing objects  
        System.out.println("Printing object values");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Integer object: " + intobj);

        // Unboxing: Converting Objects to Primitives  
        byte bytevalue = byteobj;
        int intvalue = intobj;

        //Printing primitives  
        System.out.println("Printing primitive values");
        System.out.println("byte value: " + bytevalue);
        System.out.println("int value: " + intvalue);

    }

}