package in.stackroute.hackathon.moviebackend.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public  void addMovie(Movie movie) {	
//		final String uri = "http://www.omdbapi.com/?apikey=[yourkey]&i=id";
//		RestTemplate restTemplate = new RestTemplate();
//		Movie movie = restTemplate.getForObject(uri, Movie.class);
		movieDao.save(movie);
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
