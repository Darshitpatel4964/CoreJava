import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the
 * list and print all the values using an iterator.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class CollectionIterator {

    public static void main(String[] args) {
        List < String > stringList = Arrays.asList("Hello", "World", "Darshit Patel");
        // Using iterator print all the values using an iterator
        Iterator < String > stringListIterator = stringList.iterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
    }

}


