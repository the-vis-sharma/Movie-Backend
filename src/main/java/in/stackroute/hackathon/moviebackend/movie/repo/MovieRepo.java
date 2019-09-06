package in.stackroute.hackathon.moviebackend.movie.repo;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface MovieRepo extends MongoRepository<Movie, String> {

    @Query(value = "{'title': {$regex : ?0, $options: 'i'}}")
    Page<Movie> findAllByTitle(String name, Pageable pageable);
    Movie findBy_id(ObjectId _id);
    @Query(value = "{'genre': {$regex : ?0, $options: 'i'}}")
    Page<Movie> findByGenre(String genre, Pageable pageable);
    @Query(value = "{'title': {$regex : ?0, $options: 'i'}, 'genre': {$regex : ?1, $options: 'i'}}")
    Page<Movie> findByNameAndGenre(String title, String genre, Pageable pageable);
}
