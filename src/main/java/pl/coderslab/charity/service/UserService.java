package pl.coderslab.charity.service;

import pl.coderslab.charity.model.RegisterDto;
import pl.coderslab.charity.model.User;

import java.util.List;

public interface UserService {

    User saveAdmin(User u);
    List<User> findAll();
    User findByUsername(String username);
//    User findByEmail(String email);
    User registerUser(RegisterDto dto);


    void saveUser(User user);

}
