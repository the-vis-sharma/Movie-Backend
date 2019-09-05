package in.stackroute.hackathon.moviebackend.favourite.repo;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavouriteRepo extends MongoRepository<Favourite, Integer> {

    List<Favourite> findAllByUsername(String username);

}
