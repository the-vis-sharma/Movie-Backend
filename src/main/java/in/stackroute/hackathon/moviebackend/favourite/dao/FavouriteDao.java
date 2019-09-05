package in.stackroute.hackathon.moviebackend.favourite.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FavouriteDao {

    void addFavourite(Favourite favourite);
    void removeFavourite(ObjectId _id);
    Favourite editComment(ObjectId _id, String comment);
    List<Favourite> getFavouriteByUsername(String username);

}
