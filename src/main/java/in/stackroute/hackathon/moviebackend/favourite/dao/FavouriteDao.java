package in.stackroute.hackathon.moviebackend.favourite.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FavouriteDao {

    void addFavourite(Favourite favourite);
    void removeFavourite(Integer favId);
    void editComment(Favourite favouriteDetail);
    List<Favourite> getFavouriteByUsername(String username);

}
