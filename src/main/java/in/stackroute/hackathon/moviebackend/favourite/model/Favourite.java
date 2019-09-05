package in.stackroute.hackathon.moviebackend.favourite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(collection = "favouriteList")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Favourite {

    private String username;
    private String imdbId;
    private String comment;

}
