package in.stackroute.hackathon.moviebackend.movie.service;

import java.util.List;

import in.stackroute.hackathon.moviebackend.movie.model.Movie;

public interface MovieServiceInterface{
	List<Movie> getMovies();
	List<Movie> getMoviesByName(String name);
	void addMovie(Movie movie);
	void deleteMovie(Integer id);
	void editMovie(Movie movie);
	
}