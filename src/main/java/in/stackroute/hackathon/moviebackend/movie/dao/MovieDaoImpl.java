package in.stackroute.hackathon.moviebackend.movie.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.repo.FavouriteRepo;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import in.stackroute.hackathon.moviebackend.movie.repo.MovieRepo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public void addMovie(Movie movie) {
        movieRepo.save(movie);
    }

	@Override
	public List<Movie> getMoviesByName(String name) {
		return movieRepo.findAllBytitle(name);
	}

	@Override
	public List<Movie> getMovies() {
		return movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(ObjectId _id) {
		return movieRepo.findBy_id(_id);
	}


}
