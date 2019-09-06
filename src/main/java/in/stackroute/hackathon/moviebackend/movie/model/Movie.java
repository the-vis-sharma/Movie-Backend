package in.stackroute.hackathon.moviebackend.movie.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "movieList")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
	@Id
	private ObjectId _id;
	private String title;
	private int availableTickets;
	private int bookedTickets;
	private int price;
	private String genre;
	private double rating;
	private String poster;
	private int year;
	
	// ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }
}
