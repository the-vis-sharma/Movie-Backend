package in.stackroute.hackathon.moviebackend.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document

public class Movie {
	@Id
	private int id;
	private String title;
	private int availableTickets;
	private int bookedTickets;
	private int price;
	private String genre;
	private double rating;
	private String poster;
}
