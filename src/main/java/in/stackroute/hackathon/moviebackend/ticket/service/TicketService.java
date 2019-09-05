package in.stackroute.hackathon.moviebackend.ticket.service;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService implements TicketServiceInterface {
    @Override
    public void addTicket(String username, Ticket ticket) {

    }

    @Override
    public List<Ticket> getTicketByUsername(String username) {
        return null;
    }
}
