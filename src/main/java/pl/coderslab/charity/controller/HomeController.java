package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "index";
    }
    @RequestMapping("/")
    public String homeAction(Model model){

        model.addAttribute("institutions", institutionRepository.findAll());
        model.addAttribute("noOfDonation", donationRepository.countAllById());
        model.addAttribute("donations", donationRepository.countQuantitySum());
        return "index";
    }




}
