package in.stackroute.hackathon.moviebackend.ticket.dao;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import in.stackroute.hackathon.moviebackend.ticket.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDaoImp implements TicketDao {

    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public void addTicket(Ticket ticket) {
        ticketRepo.save(ticket);
    }

    @Override
    public List<Ticket> getTicketByUsername(String username) {
        return ticketRepo.findTicketByUsername(username);
    }
}
