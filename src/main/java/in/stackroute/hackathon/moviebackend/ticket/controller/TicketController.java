package in.stackroute.hackathon.moviebackend.ticket.controller;

import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import in.stackroute.hackathon.moviebackend.ticket.service.TicketServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping("api/v1")
public class TicketController {

    @Autowired
    private TicketServiceInterface ticketServiceInterface;

    @PostMapping("tickets")
    ResponseEntity<Map> addTicket(@RequestParam("username") String username, @RequestBody Ticket ticket) {
        ticketServiceInterface.addTicket(username, ticket);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", ticket);
        map.put("message", "Ticket booked successfully.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("tickets")
    ResponseEntity<Map> getTicketByUsername(@RequestParam String username) {
        List<Ticket> ticketList = ticketServiceInterface.getTicketByUsername(username);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", ticketList);
        map.put("count", ticketList.size());
        map.put("message", (ticketList.size()==0) ? "No tickets found for user " + username : "Ticket booked successfully.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

}
