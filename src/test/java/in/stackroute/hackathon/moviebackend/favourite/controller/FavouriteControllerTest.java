//package in.stackroute.hackathon.moviebackend.favourite.controller;
//
//import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
//import in.stackroute.hackathon.moviebackend.favourite.service.FavouriteServiceInterface;
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
//@RunWith(SpringRunner.class)
//@WebMvcTest(FavouriteController.class)
//public class FavouriteControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private FavouriteServiceInterface favouriteService;
//
//    Favourite mockFavouriteData = new Favourite("Pooja","23","Movie is good");
//
//    @Test
//    public void getFavouriteByUsername() throws Exception{
//
//        Mockito.when(favouriteService.getFavouriteByUsername(Mockito.anyString())).thenReturn(mockFavouriteData);
//
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("api/v1/favourites").accept(MediaType.APPLICATION_JSON);
//
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        System.out.println(result.getResponse());
//        String expected = "{_id:123,username:Pooja,imdbId:23,comment:Movie is good}";
//        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
//    }
//
//
//}
