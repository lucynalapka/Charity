package pl.coderslab.charity.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;

@Data
public class RegisterDto {

//    @NotNull
//    private String name;
    @NotNull
    private String email;
    private String username;
    @Size(min = 6)
    private String password;
    @Size(min = 6)
    private String confirm_password;


    public User map(Role role) {
        if(!this.password.equals(this.confirm_password)) {
            return null;
        }
        User user = new User();
        user.setUsername(this.username);
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setEnabled(1);
        user.setRoles(new HashSet<>(List.of(role)));

        return user;
    }
}
