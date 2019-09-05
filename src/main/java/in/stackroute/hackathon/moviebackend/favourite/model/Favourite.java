package in.stackroute.hackathon.moviebackend.favourite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Favourite {

    private Integer favId;
    private String imdbId;
    private String comment;

}
