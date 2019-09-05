package in.stackroute.hackathon.moviebackend.service;

import in.stackroute.hackathon.moviebackend.model.User;

import java.util.List;

public interface UserServiceInterface {

    List<User> getAllUser();
    User getUserByName();

}
