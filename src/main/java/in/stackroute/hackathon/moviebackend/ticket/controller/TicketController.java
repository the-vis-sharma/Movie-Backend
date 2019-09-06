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
    ResponseEntity<Map> addTicket(@RequestBody Ticket ticket) {
        Map map = ticketServiceInterface.addTicket(ticket);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("tickets")
    ResponseEntity<Map> getTicketByUsername(@RequestParam String username, @RequestParam(value = "page", required = false) Integer page) {
        Map map = ticketServiceInterface.getTicketByUsername(username, (page!=null) ? page : 0);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

}
