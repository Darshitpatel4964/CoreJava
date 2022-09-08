package corejava;

import java.util.*;

/**
 * Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class Emi {

    public static void main(String args[]) {
        double principal = 1200;
        double rate = 10;
        double time = 1;
        rate = rate / (12 * 100);
        time = time * 12;
        double emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

        System.out.print(" EMI is= " + emi + "\n");
    }

}