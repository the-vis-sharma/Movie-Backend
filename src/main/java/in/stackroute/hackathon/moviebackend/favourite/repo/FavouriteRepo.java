package in.stackroute.hackathon.moviebackend.favourite.repo;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavouriteRepo extends MongoRepository<Favourite, Integer> {
}
