package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		// Set demonstration using HashSet
		Set<String> set = new HashSet<>();

		// adding Elements
		set.add("Darshit");
		set.add("Patel");
		set.add("Java Developer");

		// set follow unordered Way
		System.out.println(set);
	}
}
