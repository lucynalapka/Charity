//package pl.coderslab.charity.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import pl.coderslab.charity.model.Donation;
//import pl.coderslab.charity.repository.DonationRepository;
//
//import javax.validation.Valid;
//
//@Controller
//public class DonationController {
//    private final  DonationRepository donationRepository;
//
//    public DonationController(DonationRepository donationRepository) {
//        this.donationRepository = donationRepository;
//    }
//
//    @RequestMapping("/")
//    public String showDonations(Model model){
//
//        model.addAttribute("donations", donationRepository.findAll());
//
//        return "donations-list";
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String form(Model model) {
//        model.addAttribute("donation", new Donation());
//        return "/donation-form";
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String submit(@Valid Donation donation, BindingResult result) {
////        if (result.hasErrors()) {
////            return "expense-form";
////        }
//        donationService.saveDonation(donation);
//        return "redirect:/donations-list";
//    }
//
//}
