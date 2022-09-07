package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIterator {

	// java collection program to iterate over a list
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hello", "World", "Darshit Patel");

		// Using ListIterator to iterate over a list
		ListIterator<String> lItr = list.listIterator();

		// hasNext() returns true if the list has more elements
		while (lItr.hasNext()) {

			// next() returns the next element in the iteration
			System.out.println(lItr.next());

		}

		// using iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
