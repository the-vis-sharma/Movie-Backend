package in.stackroute.hackathon.moviebackend.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
