package in.stackroute.hackathon.moviebackend.movie.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieDao {

    void addMovie(Movie movie);
    List<Movie> getMoviesByName(String name);
    List<Movie> getMovies();
    Movie getMovieById(ObjectId _id);
}
