package in.stackroute.hackathon.moviebackend.ticket.service;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;

import java.util.List;

public interface TicketServiceInterface {

    void addTicket(String username, Ticket ticket);
    List<Ticket> getTicketByUsername(String username);

}
