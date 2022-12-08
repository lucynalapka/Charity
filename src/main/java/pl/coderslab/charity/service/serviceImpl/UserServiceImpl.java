package pl.coderslab.charity.service.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Role;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.repository.RoleRepository;
import pl.coderslab.charity.repository.UserRepository;
import pl.coderslab.charity.service.UserService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;



    public List<User> showUsers() {
        return userRepository.findAll();
    }
    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
    public Optional<User> get(Long id) {
        return userRepository.findById(id);
    }
    public void delete(Long id) {
        userRepository.deleteUserById(id);
    }
    public void update(User user) {
        userRepository.save(user);
    }
    @Override
    public  Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
