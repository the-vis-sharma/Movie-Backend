package in.stackroute.hackathon.moviebackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String userName;
    private List<Ticket> ticketList;
    private List<Favourite> favouriteList;

}
