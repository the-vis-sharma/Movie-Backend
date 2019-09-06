package in.stackroute.hackathon.moviebackend.favourite.controller;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.service.FavouriteServiceInterface;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class FavouriteController {  

    @Autowired
    private FavouriteServiceInterface favouriteService;

    @PostMapping("favourites")
    ResponseEntity<Map> addFavourite(@RequestBody Favourite favourite) {
        Map map = favouriteService.addFavourite(favourite);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @DeleteMapping("favourites/{id}")
    ResponseEntity<Map> removeFavourite(@PathVariable("id")  ObjectId _id) {
        Map map = favouriteService.removeFavourite(_id);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @PutMapping("favourites/{id}")
    ResponseEntity<Map> editComment(@PathVariable("id")  ObjectId _id, @RequestParam("comment") String comment) {
        Map map = favouriteService.editComment(_id, comment);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("favourites")
    ResponseEntity<Map> getFavouriteByUsername(@RequestParam("username") String username) {
        Map map = favouriteService.getFavouriteByUsername(username);
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

}
