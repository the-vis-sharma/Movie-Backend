package in.stackroute.hackathon.moviebackend.movie.repo;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepo extends MongoRepository<Movie, String> {

    List<Movie> findAllBytitle(String name);
    Movie findBy_id(ObjectId _id);
}
