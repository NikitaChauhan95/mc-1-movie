package com.jap;

import java.util.*;

public class MovieService {

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map<Movie, Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map, 4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating(map);
        System.out.println("--------------");
        System.out.println("Highest Rating " + list);
    }

    public Map<Movie, Integer> getMovieWithRating() {

        //create five movie object by calling Movie class parameterized constructor

        //create HashMap object and add all the Movie object inside it

        //Key will be movie object and value will be rating ranging from 1 to 5

        //return the HashMap object
        Map map = new HashMap();

        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie, Integer> map, int rating) {
        //Create a TreeSet object

        //Use entrySet() method to iterate through the map object

        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object

        return null;
    }

    public List<String> getMovieWithHighestRating(Map<Movie, Integer> map) {
        //Create a ArrayList object of type String


        //get the first value from the map and store it in the variable max

        // Use entrySet().iterator().next() method to retrieve the first value of Map object


        //get the name of the movie with the highest rating and add it in the List created

        //return the List object

        List l = new ArrayList();
        return l;
    }

    public Map<String, String> getAllMoviesWithComedy(Map<Movie, Integer> map) {
        //Create a Map object

        //use entrySet to iterate through the Map object

        //get all the movies name and their released date for the movie of genre "comedy"

        //store movie name with release date in the above created Map object and return the Map object

        Map map1 = new HashMap();
        return map1;

    }
}
