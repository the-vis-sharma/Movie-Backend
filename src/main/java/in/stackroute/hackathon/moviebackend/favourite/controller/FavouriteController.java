package in.stackroute.hackathon.moviebackend.favourite.controller;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.service.FavouriteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping("api/v1")
public class FavouriteController {

    @Autowired
    private FavouriteServiceInterface favouriteService;

    @PostMapping("favourites")
    ResponseEntity<Map> addFavourite(@RequestBody Favourite favourite) {
        Map map = favouriteService.addFavourite(favourite);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @DeleteMapping("favourites/{favId}")
    ResponseEntity<Map> removeFavourite(@RequestParam("username") String username, @PathVariable("favId") Integer favId) {
        Map map = favouriteService.removeFavourite(favId);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @PutMapping("favourites")
    ResponseEntity<Map> editComment(@RequestParam("username") String username, @RequestBody Favourite favouriteDetail) {
        Map map = favouriteService.editComment(favouriteDetail);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("favourites")
    ResponseEntity<Map> getFavouriteByUsername(@RequestParam("username") String username) {
        Map map = favouriteService.getFavouriteByUsername(username);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

}
