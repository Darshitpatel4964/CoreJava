package corejava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the
 * list and print all the values using an iterator.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class CollectionIterator {

    // Java collection program to iterate over a list
    public static void main(String[] args) {

        List < String > arraytList = Arrays.asList("Hello", "World", "Darshit Patel");

        // Using ListIterator to iterate over a list
        ListIterator < String > listIterator = arraytList.listIterator();

        // HasNext() returns true if the list has more elements
        while (listIterator.hasNext()) {

            // Next() returns the next element in the iteration
            System.out.println(listIterator.next());

        }

        // Using iterator
        Iterator < String > iterator = arraytList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}


