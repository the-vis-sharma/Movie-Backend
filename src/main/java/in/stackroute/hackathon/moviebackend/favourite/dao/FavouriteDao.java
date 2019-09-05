package in.stackroute.hackathon.moviebackend.favourite.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;

import java.util.List;

public interface FavouriteDao {

    void addFavourite(String username, Favourite favourite);
    void removeFavourite(String username, Integer favId);
    void editComment(String username, Favourite favouriteDetail);
    List<Favourite> getAllFavourites();
    List<Favourite> getFavouriteByUsername();

}
