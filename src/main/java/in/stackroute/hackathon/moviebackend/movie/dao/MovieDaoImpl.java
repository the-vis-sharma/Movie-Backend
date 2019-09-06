package in.stackroute.hackathon.moviebackend.movie.dao;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.repo.FavouriteRepo;
import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import in.stackroute.hackathon.moviebackend.movie.repo.MovieRepo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
	public List<Movie> getMoviesByName(String name, int page) {
		return movieRepo.findAllByTitle(name, new PageRequest(page, 12)).getContent();
	}

	@Override
	public List<Movie> getMovies(int page) {
		return movieRepo.findAll(new PageRequest(page, 12)).getContent();
	}

	@Override
	public Movie getMovieById(ObjectId _id) {
		return movieRepo.findBy_id(_id);
	}

	@Override
	public List<Movie> getMoviesByGenre(String genre, int page) {
		return movieRepo.findByGenre(genre, new PageRequest(page, 12)).getContent();
	}

	@Override
	public List<Movie> getMoviesByNameAndGenre(String name, String genre, int page) {
		return movieRepo.findByNameAndGenre(name, genre, new PageRequest(page, 12)).getContent();
	}


}
