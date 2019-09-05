package in.stackroute.hackathon.moviebackend.movie.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.stackroute.hackathon.moviebackend.movie.model.Movie;

@Repository	
public interface MovieRepo extends MongoRepository<Movie, Integer> {
	
}
