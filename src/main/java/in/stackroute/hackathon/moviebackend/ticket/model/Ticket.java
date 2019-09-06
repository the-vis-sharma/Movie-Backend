package in.stackroute.hackathon.moviebackend.ticket.model;


import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(collection = "tickets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {

    private String username;

    @DBRef
    private Movie movie;

    private int seats;
    private double amount;

}
