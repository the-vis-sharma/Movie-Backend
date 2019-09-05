package in.stackroute.hackathon.moviebackend.favourite.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.repo.FavouriteRepo;
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
    public void removeFavourite(Favourite favourite) {
        favouriteRepo.delete(favourite);
    }

    @Override
    public void editComment(Favourite favouriteDetail) {
        Favourite favourite = favouriteRepo.findByUsernameAndAndImdbId(favouriteDetail.getUsername(), favouriteDetail.getImdbId());
        favourite.setComment(favouriteDetail.getComment());
        favouriteRepo.save(favourite);
    }

    @Override
    public List<Favourite> getFavouriteByUsername(String username) {
        return favouriteRepo.findAllByUsername(username);
    }
}
