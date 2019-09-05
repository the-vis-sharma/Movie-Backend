package in.stackroute.hackathon.moviebackend.favourite.controller;

import in.stackroute.hackathon.moviebackend.favourite.model.Favourite;
import in.stackroute.hackathon.moviebackend.favourite.service.FavouriteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping("api/v1")
public class FavouriteController {

    @Autowired
    private FavouriteServiceInterface favouriteServiceInterface;

    @PostMapping("favourites")
    ResponseEntity<Map> addFavourite(@RequestParam("username") String username, @RequestBody Favourite favourite) {
        favouriteServiceInterface.addFavourite(username, favourite);
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("data", favourite);
        map.put("message", "Movie added to favourite.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @DeleteMapping("favourites/{favId}")
    ResponseEntity<Map> removeFavourite(@RequestParam("username") String username, @PathVariable("favId") Integer favId) {
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("message", "Movie added to favourite.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @PutMapping("favourites")
    ResponseEntity<Map> editComment(@RequestParam("username") String username, @RequestBody Favourite favouriteDetail) {
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("message", "Movie added to favourite.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

    @GetMapping("favourites")
    ResponseEntity<Map> getFavouriteByUsername(@RequestParam("username") String username) {
        Map<String, Object> map = new TreeMap<>();
        map.put("status", HttpStatus.CREATED);
        map.put("message", "Movie added to favourite.");
        return new ResponseEntity(map, HttpStatus.CREATED);
    }

}
