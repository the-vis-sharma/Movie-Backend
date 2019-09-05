package in.stackroute.hackathon.moviebackend.favourite.service;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;

import java.util.List;
import java.util.Map;

public interface FavouriteServiceInterface {

    Map<String, Object> addFavourite(Favourite favourite);
    Map<String, Object> removeFavourite(Integer favId);
    Map<String, Object> editComment(Favourite favouriteDetail);
    Map<String, Object> getFavouriteByUsername(String username);

}
