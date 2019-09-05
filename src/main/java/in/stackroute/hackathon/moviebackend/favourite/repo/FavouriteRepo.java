package in.stackroute.hackathon.moviebackend.favourite.repo;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavouriteRepo extends MongoRepository<Favourite, String> {

    List<Favourite> findAllByUsername(String username);
    Favourite findBy_id(ObjectId _id);

}
