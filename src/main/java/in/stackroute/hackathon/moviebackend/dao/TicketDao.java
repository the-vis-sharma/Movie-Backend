package in.stackroute.hackathon.moviebackend.dao;

import in.stackroute.hackathon.moviebackend.model.Ticket;

import java.util.List;

public interface TicketDao {

    void addTicket(String username, Ticket ticket);
    List<Ticket> getAllTicket();
    List<Ticket> getTicketByUsername();

}
