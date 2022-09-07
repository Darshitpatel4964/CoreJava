package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.util.ArrayList;
import java.util.Collections;

// class Movie  implements Comparable
class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m) {
		return this.year - m.year;
	}

	// Constructor
	public Movie(String n, double rt, int yr) {
		this.name = n;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

class ComparableAndCompareto {

	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Gajab Thai Gyo", 9.0, 2022));
		list.add(new Movie("Fakt Mahilao Mate", 8.0, 2022));
		list.add(new Movie("Dear Father", 10.0, 2021));
		Collections.sort(list);
		System.out.println("Movie After Sorting:");
		for (Movie m : list) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}

}
