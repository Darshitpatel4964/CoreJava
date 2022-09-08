package corejava;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Consider a Movie class that has members like, rating, name, year. Suppose wewish to sort a list of Movies 
 * based on year of release. We can implement theComparable interface with the Movie class, and we override 
 * the method compareTo() of Comparable interface.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

// Class Movie  implements Comparable
class Movie implements Comparable < Movie > {
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    // Constructor
    public Movie(String name, double rate, int year) {
        this.name = name;
        this.rating = rate;
        this.year = year;
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

class ComparableAndComparetor {

    public static void main(String[] args) {
    	ArrayList < Movie > list = new ArrayList < Movie > ();
        list.add(new Movie("Gajab Thai Gyo", 9.0, 2022));
        list.add(new Movie("Fakt Mahilao Mate", 8.0, 2022));
        list.add(new Movie("Dear Father", 10.0, 2021));
        Collections.sort(list);
        System.out.println("Movie After Sorting:");
        for (Movie movie: list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }

}