//package pl.coderslab.charity.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class UserDto {
//
//    @NotEmpty
//    private String firstName;
//    @NotEmpty
//    private String lastName;
//    @NotEmpty
//    @Email
//    private String email;
////    private String username;
//    @Size(min = 6)
//    private String password;
//    @Size(min = 6)
//    private String confirm_password;
//
//
//////    public User map(Role role) {
//////        if(!this.password.equals(this.confirm_password)) {
//////            return null;
//////        }
////        User user = new User();
//////        user.setName(this.name);
//////        user.setUsername(this.username);
////        user.setEmail(this.email);
////        user.setPassword(this.password);
////        user.setEnabled(1);
////        user.setRoles(new HashSet<>(List.of(role)));
////
////        return user;
////    }
//}
