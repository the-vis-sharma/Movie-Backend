package in.stackroute.hackathon.moviebackend.repo;

import in.stackroute.hackathon.moviebackend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepo extends MongoRepository<Ticket, Integer> {
}
