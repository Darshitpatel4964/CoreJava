package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		// create an arraylist from the array
		// using asList() method of the Arrays class
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E"));
		System.out.println("ArrayList with duplicate elements: " + list);

		// convert the arraylist into a set
		Set<String> set = new LinkedHashSet();
		set.addAll(list);

		// delete all elements of arraylist
		list.clear();

		// add element from set to arraylist
		list.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + list);
	}

}
