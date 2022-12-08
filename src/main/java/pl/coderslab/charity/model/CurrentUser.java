package pl.coderslab.charity.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import org.springframework.security.core.userdetails.User;

public class CurrentUser extends User{
    private final pl.coderslab.charity.model.User user;
    public CurrentUser(String name, String lastName, String email, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       pl.coderslab.charity.model.User user) {
        super(email, password, authorities);
        this.user = user;
    }
    public pl.coderslab.charity.model.User getUser() {
        return user;}
}
