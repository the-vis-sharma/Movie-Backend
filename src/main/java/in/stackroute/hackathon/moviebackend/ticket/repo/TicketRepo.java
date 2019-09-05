package in.stackroute.hackathon.moviebackend.ticket.repo;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepo extends MongoRepository<Ticket, Integer> {
}
