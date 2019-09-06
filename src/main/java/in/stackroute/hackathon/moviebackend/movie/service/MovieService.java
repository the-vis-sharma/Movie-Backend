package in.stackroute.hackathon.moviebackend.movie.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.stackroute.hackathon.moviebackend.movie.dao.MovieDao;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

@Service
public class MovieService implements MovieServiceInterface{
	
	@Autowired
	MovieDao movieDao;
	@Override
	public List<Movie> getMovies() {
		return movieDao.findAll();
	}

	@Override
	public  Map<String, Object> addMovie(Movie movie) {	
		Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", movie);
        map.put("message", "Movie added to database.");
		movieDaoImpl.addMovie(movie);
		return map;
	}

	@Override
	public List<Movie> getMoviesByName(String name) {
		
		return movieDao.getMoviesByName(name);
	}

	@Override
	public void deleteMovie(Integer id) {
		movieDao.deleteById(id);
		
	}

	@Override
	public void editMovie(Movie movie) {
		movieDao.save(movie);
	}
	
}
