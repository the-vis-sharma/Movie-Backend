package in.stackroute.hackathon.moviebackend.service;

import in.stackroute.hackathon.moviebackend.model.Ticket;

import java.util.List;

public interface TicketServiceInterface {

    void addTicket(String username, Ticket ticket);
    List<Ticket> getAllTicket();
    List<Ticket> getTicketByUsername();

}
