package in.stackroute.hackathon.moviebackend.favourite.model;

import in.stackroute.hackathon.moviebackend.movie.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
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

    @Id
    private ObjectId _id;
    private String username;

    @DBRef
    private Movie movie;

    private String comment;

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

}
