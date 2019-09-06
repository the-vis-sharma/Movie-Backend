package in.stackroute.hackathon.moviebackend.movie.service;

import in.stackroute.hackathon.moviebackend.favourite.dao.FavouriteDaoImp;
import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.dao.MovieDaoImpl;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class MovieService implements MovieServiceInterface {

    @Autowired
    private MovieDaoImpl movieDaoImpl;

    @Override
    public Map<String, Object> addMovie(Movie movie) {
        movieDaoImpl.addMovie(movie);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", movie);
        map.put("message", "Movie added to database");
        return map;
    }
    
    @Override
    public Map<String, Object> getMovies() {
        List<Movie> movieList = movieDaoImpl.getMovies();
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", movieList);
        map.put("count", movieList.size());
        map.put("message", "Got movies from database");
        return map;
    }
    
    @Override
    public Map<String, Object> getMoviesByName(String name) {
        List<Movie> favouriteList = movieDaoImpl.getMoviesByName(name);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", favouriteList);
        map.put("count", favouriteList.size());
        map.put("message", (favouriteList.size()==0) ? "No Movie in movie list." : "All Data loaded.");
        return map;
    }
    

    @Override
    public Map<String, Object> getMovieById(ObjectId id) {
        Movie movie = movieDaoImpl.getMovieById(id);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", movie);
        map.put("message", (movie == null) ? "No Movie in movie list." : "All Data loaded.");
        return map;
    }

}
