package in.stackroute.hackathon.moviebackend.repo;

import in.stackroute.hackathon.moviebackend.model.Favourite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavouriteRepo extends MongoRepository<Favourite, Integer> {
}
