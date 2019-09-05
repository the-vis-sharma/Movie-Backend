package in.stackroute.hackathon.moviebackend.favourite.service;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

public interface FavouriteServiceInterface {

    Map<String, Object> addFavourite(Favourite favourite);
    Map<String, Object> removeFavourite(ObjectId _id);
    Map<String, Object> editComment(ObjectId _id, String comment);
    Map<String, Object> getFavouriteByUsername(String username);

}
