package in.stackroute.hackathon.moviebackend.favourite.service;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteService implements FavouriteServiceInterface {
    @Override
    public void addFavourite(String username, Favourite favourite) {

    }

    @Override
    public void removeFavourite(String username, Integer favId) {

    }

    @Override
    public void editComment(String username, Favourite favouriteDetail) {

    }

    @Override
    public List<Favourite> getFavouriteByUsername(String username) {
        return null;
    }
}
