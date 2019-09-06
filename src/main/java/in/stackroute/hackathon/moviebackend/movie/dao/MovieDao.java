package in.stackroute.hackathon.moviebackend.movie.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieDao {

    void addMovie(Movie movie);
    List<Movie> getMoviesByName(String name, int page);
    List<Movie> getMovies(int page);
    Movie getMovieById(ObjectId _id);
    List<Movie> getMoviesByGenre(String genre, int page);
    List<Movie> getMoviesByNameAndGenre(String name, String genre, int page);
}
