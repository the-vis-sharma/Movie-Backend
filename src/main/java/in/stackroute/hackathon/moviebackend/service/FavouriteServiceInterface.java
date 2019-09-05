package in.stackroute.hackathon.moviebackend.service;

import in.stackroute.hackathon.moviebackend.model.Favourite;

import java.util.List;

public interface FavouriteServiceInterface {

    void addFavourite(String username, Favourite favourite);
    void removeFavourite(String username, Integer favId);
    void editComment(String username, Favourite favouriteDetail);
    List<Favourite> getAllFavourites();
    List<Favourite> getFavouriteByUsername();

}
