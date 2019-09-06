package in.stackroute.hackathon.moviebackend.ticket.service;

import in.stackroute.hackathon.moviebackend.ticket.dao.TicketDao;
import in.stackroute.hackathon.moviebackend.ticket.dao.TicketDaoImp;
import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class TicketService implements TicketServiceInterface {

    @Autowired
    private TicketDaoImp ticketDaoImp;

    @Override
    public Map<String, Object> addTicket(Ticket ticket) {
        ticketDaoImp.addTicket(ticket);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("message", "Movie ticket booked successfully.");
        map.put("data", ticket);
        return  map;
    }

    @Override
    public Map<String, Object> getTicketByUsername(String username, int page) {
        List<Ticket> ticketList = ticketDaoImp.getTicketByUsername(username, page);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("message", (ticketList.size()==0) ? "No movie tickets found for this username." : "Movie ticket booked successfully.");
        map.put("data", ticketList);
        map.put("page_no", page);
        map.put("count", ticketList.size());
        return map;
    }
}
