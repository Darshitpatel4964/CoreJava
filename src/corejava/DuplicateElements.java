import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class DuplicateElements {

    public static void main(String[] args) {
        // Create an arraylist from the array
        // Using asList() method of the Arrays class
        ArrayList < String > duplicateList = new ArrayList < > (Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E"));
        System.out.println("ArrayList with duplicate elements: " + duplicateList);

        // Convert the arraylist into a set
        Set < String > newList = new LinkedHashSet();
        newList.addAll(duplicateList);

        // Delete all elements of arraylist
        duplicateList.clear();

        // Add element from set to arraylist
        duplicateList.addAll(newList);
        System.out.println("ArrayList without duplicate elements: " + duplicateList);
    }

}
