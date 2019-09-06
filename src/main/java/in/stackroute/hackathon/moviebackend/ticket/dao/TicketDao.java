package in.stackroute.hackathon.moviebackend.ticket.dao;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TicketDao {

    void addTicket(Ticket ticket);
    List<Ticket> getTicketByUsername(String username, int page);

}
