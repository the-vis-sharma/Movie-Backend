package in.stackroute.hackathon.moviebackend.ticket.repo;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TicketRepo extends MongoRepository<Ticket, Integer> {

    Page<Ticket> findTicketByUsername(String username, Pageable pageable);

}
