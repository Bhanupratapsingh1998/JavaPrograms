package com.code.comparison;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return (int) (o1.getRating() - o2.getRating());
    }
}

class NameCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
