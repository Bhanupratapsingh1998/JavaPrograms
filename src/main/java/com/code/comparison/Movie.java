package com.code.comparison;

/**
 *
 * @author User
 */
// A Java program to demonstrate use of Comparable
import java.util.*;

public class Movie implements Comparable<Movie> {

    private final double rating;
    private final String name;
    private final int year;

    // Used to sort movies by year
    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr) {
        this.name = nm;
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

// Driver class
class Main {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list, new RatingCompare());

        ArrayList<Movie> list1 = new ArrayList<>();
        list1.addAll(list);
         Collections.sort(list1, new NameCompare());
        System.out.println("Movies after sorting : ");
        list.forEach(movie -> {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " "
                    + movie.getYear());
        });
         System.out.println("-------------------------------");
        list1.forEach(movie -> {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " "
                    + movie.getYear());
        });
    }
}
