import java.util.HashSet;
import java.util.Set;

/**
 * Write a program using set concept.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class SetExample {

    public static void main(String[] args) {
        // Set demonstration using HashSet
        Set < String > addSetElements = new HashSet < > ();

        // Adding Elements
        addSetElements.add("Darshit");
        addSetElements.add("Patel");
        addSetElements.add("Java Developer");

        // Set follow unordered Way
        System.out.println(addSetElements);
    }

}