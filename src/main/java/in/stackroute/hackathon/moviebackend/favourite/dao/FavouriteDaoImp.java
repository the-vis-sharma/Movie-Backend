package in.stackroute.hackathon.moviebackend.favourite.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.repo.FavouriteRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FavouriteDaoImp implements FavouriteDao {

    @Autowired
    private FavouriteRepo favouriteRepo;

    @Override
    public void addFavourite(Favourite favourite) {
        favouriteRepo.save(favourite);
    }

    @Override
    public void removeFavourite(ObjectId _id) {
        Favourite favourite = favouriteRepo.findBy_id(_id);
        favouriteRepo.delete(favourite);
    }

    @Override
    public Favourite editComment(ObjectId _id, String comment) {
        Favourite favourite = favouriteRepo.findBy_id(_id);
        favourite.setComment(comment);
        favouriteRepo.save(favourite);
        return favourite;
    }

    @Override
    public List<Favourite> getFavouriteByUsername(String username) {
        return favouriteRepo.findAllByUsername(username);
    }
}
