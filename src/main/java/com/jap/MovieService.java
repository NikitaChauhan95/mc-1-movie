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
        Movie movie1 = new Movie(123, "Inception", "Action", "24/2/19");
        Movie movie2 = new Movie(456, "Edge Of Tomorrow", "Science Fiction", "28/2/19");
        Movie movie3 = new Movie(789, "Jumanji", "Comedy", "12/2/19");
        Movie movie4 = new Movie(104, "Matrix", "Drama", "23/2/19");
        Movie movie5 = new Movie(195, "Sangharsh", "Thriller", "11/2/19");

        //create HashMap object and add all the Movie object inside it
        HashMap<Movie, Integer> recentMovie = new HashMap<>();

        //Key will be movie object and value will be rating ranging from 1 to 5
        recentMovie.put(movie1, 2);
        recentMovie.put(movie2, 3);
        recentMovie.put(movie3, 3);
        recentMovie.put(movie4, 4);
        recentMovie.put(movie5, 5);
        //return the HashMap object

        return recentMovie;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie, Integer> map, int rating) {
        //Create a TreeSet object
        Set<String> movieNew = new TreeSet<>();
        //Use entrySet() method to iterate through the map object
        Iterator<Map.Entry<Movie, Integer>> iterator = map.entrySet().iterator();
        //retrieve all the movies name having rating as 4
        while (iterator.hasNext()) {
            Map.Entry<Movie, Integer> next = iterator.next();
            if (next.getValue() == rating) {
                movieNew.add(next.getKey().getMovieName());
            }
        }
        //Store the movie name in TreeSet object

        //return the TreeSet object

        return movieNew;
    }

    public List<String> getMovieWithHighestRating(Map<Movie, Integer> map) {
        //Create a ArrayList object of type String
        ArrayList<String> highestRating = new ArrayList<>();
        //get the first value from the map and store it in the variable max

        // Use entrySet().iterator().next() method to retrieve the first value of Map object
        Iterator<Map.Entry<Movie, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Movie, Integer> max = iterator.next();
        //get the name of the movie with the highest rating and add it in the List created
        while (iterator.hasNext()) {
            Map.Entry<Movie, Integer> next = iterator.next();
            if (max.getValue() < next.getValue()) {
                max = next;
            }
        }

        //return the List object

        highestRating.add(max.getKey().getMovieName());
        return highestRating;
    }

    public Map<String, String> getAllMoviesWithComedy(Map<Movie, Integer> map) {
        //Create a Map object
        Map<String, String> comedyMovie = new HashMap<>();
        //use entrySet to iterate through the Map object
        for (Map.Entry<Movie, Integer> next : map.entrySet()) {
            //get all the movies name and their released date for the movie of genre "comedy"
            if (next.getKey().getGenre().equalsIgnoreCase("Comedy")) {
                comedyMovie.put(next.getKey().getMovieName(), next.getKey().getReleaseDate());
            }
        }//store movie name with release date in the above created Map object and return the Map object
        return comedyMovie;

    }
}
