package in.stackroute.hackathon.moviebackend.ticket.service;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;

import java.util.Map;

public interface TicketServiceInterface {

    Map<String, Object> addTicket(Ticket ticket);
    Map<String, Object> getTicketByUsername(String username);

}
