package in.stackroute.hackathon.moviebackend.movie.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import in.stackroute.hackathon.moviebackend.movie.service.MovieServiceInterface;

@RestController
@RequestMapping("api/v1")
public class MovieController {
	
	@Autowired
	private MovieServiceInterface movieServiceInterface;
	
	@PostMapping("movies")
	ResponseEntity<Map> addMovie(@RequestBody Movie movie) {
        movieServiceInterface.addMovie(movie);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", movie);
        map.put("message", "Movie added to database.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }
	
	@GetMapping("movies")
    ResponseEntity<Map> getMovies() {
		List<Movie> result = movieServiceInterface.getMovies();
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.OK);
        map.put("data", result);
        map.put("message", "Reteived movies");
        return new ResponseEntity(map, HttpStatus.OK);
    }
	
	@GetMapping("movies/{name}")
		ResponseEntity<Map> getMoviesByName(@PathVariable("name") String name){
			List<Movie> result = movieServiceInterface.getMoviesByName(name);
			Map<String, Object> map = new TreeMap<>();
	        map.put("status", HttpStatus.OK);
	        map.put("data", result);
	        map.put("message", "Got Back Queried Movie");
	        return new ResponseEntity(map, HttpStatus.OK);	
	}
	
	@DeleteMapping("movies/{id}")
    ResponseEntity<Map> removeFavourite(@PathVariable("id") Integer id) {
        Map<String, Object> map = new TreeMap<>();
        movieServiceInterface.deleteMovie(id);
        map.put("status", HttpStatus.OK);
        map.put("message", "Movie deleted");
        return new ResponseEntity(map, HttpStatus.OK);
    }
	
	 @PutMapping("movies")
	    ResponseEntity<Map> editMovie(@RequestBody Movie movie) {
	        Map<String, Object> map = new TreeMap<>();
	        movieServiceInterface.editMovie(movie);
	        map.put("status", HttpStatus.OK);
	        map.put("message", "Movie edited");
	        return new ResponseEntity(map, HttpStatus.OK);
	    }
}
