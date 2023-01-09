package pl.coderslab.charity.service;

import pl.coderslab.charity.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    public List<User> showUsers();
    public void saveUser(User user);
    public Optional<User> get(Long id);
    public void delete(Long id);
    public void update(User user);
    Optional<User> findByEmail(String email);

    void saveAdmin(User u);


//    public User findByEmail(String email);


}


//    List<UserDto> findAllUsers();

//    User findByEmail(String email);
//
//    //    User findByEmail(String email);
////    User registerUser(User user);
//
//
//    void saveUser(User user);
//
//    List<User> findAll();
//}
