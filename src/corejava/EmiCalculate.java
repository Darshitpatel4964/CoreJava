import java.util.Scanner;

/**
 * Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class EmiCalculate {

    public static void main(String[] args) {
        // Scanner class to take user input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextFloat();

        System.out.print("Enter rate: ");
        double rate = scanner.nextFloat();

        System.out.print("Enter time in year: ");
        double time = scanner.nextFloat();

        rate = rate / (12 * 100);
        time = time * 12;

        double emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        System.out.print("Monthly EMI is= " + emi + "\n");
    }

}
