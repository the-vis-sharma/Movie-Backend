package in.stackroute.hackathon.moviebackend.movie.controller;



import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.service.FavouriteServiceInterface;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import in.stackroute.hackathon.moviebackend.movie.service.MovieServiceInterface;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    @PostMapping("movies")
    ResponseEntity<Map> addMovie(@RequestBody Movie movie) {
        Map map = movieService.addMovie(movie);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("movies")
    ResponseEntity<Map> getMovies(@RequestParam(value = "name", required = false) String name) {
        Map map;
        if(name != null && !name.isEmpty()) {
        	map = movieService.getMovies();
        }
        else {
        	map = movieService.getMoviesByName();
        }
        return new ResponseEntity(map, HttpStatus.OK);
    }
    
    @GetMapping("movies/{id}")
    ResponseEntity<Map> getMovieById(@PathVariable("id") String id) {
        Map map = movieService.getMovieById(id);
        return new ResponseEntity(map, HttpStatus.OK);
    }
    
    
}
