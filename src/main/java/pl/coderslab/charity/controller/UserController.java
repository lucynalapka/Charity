package pl.coderslab.charity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }




    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, User user) {
        model.addAttribute("user", user);
        return "login-form";
    }
    @PostMapping(value = "/logout")
    public String logout() {
        return "redirect:/";
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("user", new User());
        return "register-form";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerForm(@Valid @ModelAttribute User user, BindingResult result) {
//        Optional<User> existingUser = userService.findByEmail(user.getEmail());
//        if (existingUser != null && existingUser.get().getEmail() != null && !existingUser.get().getEmail().isEmpty()) {
//            result.rejectValue("email", null,
//                    "An account registered with the same email already exists");
////            return "register-form";
//        }

        if (result.hasErrors()) {
            return "register-form";
        }

        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping(value = "/user/delete")
    public String delete(User user) {
        userService.delete(user.getId());
        return "redirect:/logout";
    }

    @GetMapping(value = "/user/edit")
    public String editForm(User user, Model model) {
        model.addAttribute("user", userService.get(user.getId()).get());
        return "user-edit";
    }

    @PostMapping(value = "/user/edit")
    public String edit(@Valid User user, BindingResult result) {
        if (!result.hasErrors()) {
            userService.update(user);
            return "redirect:/user";
        }
        return "user-edit";
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String users(Model model) {
        List<User> usersList = userService.showUsers();
        model.addAttribute("users", usersList);
        return "users-list";
    }

}
