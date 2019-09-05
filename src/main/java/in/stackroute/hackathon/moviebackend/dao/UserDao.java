package in.stackroute.hackathon.moviebackend.dao;

import in.stackroute.hackathon.moviebackend.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();
    User getUserByName();

}
