package pl.coderslab.charity.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.CurrentUser;
import pl.coderslab.charity.model.User;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class SpringDataUserDetailsService implements UserDetailsService {

    private UserService userService;

    public SpringDataUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) {
        Optional<User> user = userService.findByEmail(email);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException(email);
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.get().getRoles().forEach(r ->
                grantedAuthorities.add(new SimpleGrantedAuthority(r.getName())));
        return new CurrentUser(user.get().getName(), user.get().getLastName(), user.get().getEmail(), user.get().getPassword(),
                grantedAuthorities, user.get());
    }

}

