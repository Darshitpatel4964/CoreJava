import java.io.IOException;

/**
 * Write a program to handle exceptions using throws keywords.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class ThrowsException {

    void medium() throws IOException {
        throw new IOException("error"); // Checked exception
    }

    void average() throws IOException {
        medium();
    }

    void hard() {
        try {
            average();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        
    }

    public static void main(String args[]) {
        ThrowsException throwsException = new ThrowsException();
        throwsException.hard();
        System.out.println("normal exception");
    }

}
