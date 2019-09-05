package in.stackroute.hackathon.moviebackend.ticket.dao;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;

import java.util.List;

public interface TicketDao {

    void addTicket(String username, Ticket ticket);
    List<Ticket> getTicketByUsername(String username);

}
