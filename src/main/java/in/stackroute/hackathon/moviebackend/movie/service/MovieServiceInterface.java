package in.stackroute.hackathon.moviebackend.movie.service;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

public interface MovieServiceInterface{
	Map<String, Object> addMovie(Movie movie);
    Map<String, Object> getMovieById(ObjectId id);
    Map<String, Object> getMovies();
	Map<String, Object> getMoviesByName(String name);
	
}