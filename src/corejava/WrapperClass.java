/**
 * Create a program to compare two variables of Wrapper class using Wrapper classes.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

// Java program to convert primitive into objects  
// Java program to convert object into primitives 
public class WrapperClass {

    public static void main(String args[]) {
        // 1.Java program to convert primitive into objects  
        // Converting int into Integer  
        int a = 20;
        Integer i = Integer.valueOf(a); // onverting int into Integer explicitly  
        Integer j = a; // Autoboxing, now compiler will write Integer.valueOf(a) internally  
        System.out.println(a + " " + i + " " + j);

        // 2.Java program to convert object into primitives
        // Converting Integer to int    
        Integer b = new Integer(3);
        int p = b.intValue(); // Converting Integer to int explicitly  
        int q = b; // Unboxing, now compiler will write a.intValue() internally    
        System.out.println(b + " " + p + " " + q);
    }

}