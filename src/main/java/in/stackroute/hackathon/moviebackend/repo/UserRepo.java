package in.stackroute.hackathon.moviebackend.repo;

import in.stackroute.hackathon.moviebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
