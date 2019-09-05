package in.stackroute.hackathon.moviebackend.movie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import in.stackroute.hackathon.moviebackend.movie.repo.MovieRepo;


@Repository
public interface MovieDao extends MovieRepo{
	
	@Query("SELECT m FROM MoviesModel m WHERE m.title=?1")
	List<Movie> getMoviesByName(String name);
}
