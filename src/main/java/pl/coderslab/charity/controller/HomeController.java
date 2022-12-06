package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.model.RegisterDto;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;
import pl.coderslab.charity.service.UserService;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;
    private final UserService userService;



    @RequestMapping("/")
    public String homeAction(Model model){

        model.addAttribute("institutions", institutionRepository.findAll());
        model.addAttribute("noOfDonation", donationRepository.countAllById());
        model.addAttribute("donations", donationRepository.countQuantitySum());
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login-form";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return "register-form";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute RegisterDto registerDto, BindingResult result){
        User user=null;

        if(!result.hasErrors() ){
            user=userService.registerUser(registerDto);


            if(user!=null) {
                return "redirect:login-form";
            }
        }
        return "register-form";

    }


}
