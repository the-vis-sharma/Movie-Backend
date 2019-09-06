package in.stackroute.hackathon.moviebackend.favourite.repo;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FavouriteRepo extends MongoRepository<Favourite, String> {

    @Query(value = "{'username': {$regex : ?0, $options: 'i'}}")
    Page<Favourite> findAllByUsername(String username, Pageable pageable);
    Favourite findBy_id(ObjectId _id);

}
