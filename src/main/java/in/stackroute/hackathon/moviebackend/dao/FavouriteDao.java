package in.stackroute.hackathon.moviebackend.dao;

import in.stackroute.hackathon.moviebackend.model.Favourite;

public interface FavouriteDao {

    void addFavourite(String username, Favourite favourite);

}
