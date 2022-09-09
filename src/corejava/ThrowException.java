/**
 * Write a program to handle exceptions using throw keywords.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class ThrowException {
    
    public static void validate(int age) {
        if (age < 18) {
            // Throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person Is Eligible to vote");
        }
        
    }

    public static void main(String[] args) {
        // Function calling
        validate(15);
        System.out.println("Rest Of Code");
    }

}