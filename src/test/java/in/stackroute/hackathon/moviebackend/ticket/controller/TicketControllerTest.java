package in.stackroute.hackathon.moviebackend.ticket.controller;

//import in.stackroute.hackathon.moviebackend.favourite.controller.FavouriteController;
//import in.stackroute.hackathon.moviebackend.favourite.service.FavouriteServiceInterface;
//import in.stackroute.hackathon.moviebackend.ticket.model.Ticket;
//import in.stackroute.hackathon.moviebackend.ticket.service.TicketServiceInterface;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.Map;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(TicketController.class)
//public class TicketControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private TicketServiceInterface ticketServiceInterface;
//
//    Ticket mockTicketData = new Ticket("Pooja","1",5,200.0);
//
//    @Test
//    public void getTicketByUsername() throws Exception {
//
//        Mockito.when(ticketServiceInterface.getTicketByUsername(Mockito.anyString())).thenReturn((Map<String, Object>) mockTicketData);
//
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("api/v1/favourites").accept(MediaType.APPLICATION_JSON);
//
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        System.out.println(result.getResponse());
//        String expected = "{username:Pooja,imdbId:1,seats:5,amount:200.0}";
//        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
//    }
//
//
//}
