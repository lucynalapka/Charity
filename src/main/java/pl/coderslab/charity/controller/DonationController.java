package pl.coderslab.charity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;

import pl.coderslab.charity.service.serviceImpl.InstitutionServiceImpl;

import java.util.List;

@Controller
public class DonationController {

    private final CategoryService categoryService;

    private final InstitutionServiceImpl institutionServiceImpl;
    private final DonationService donationService;

    public DonationController(CategoryService categoryService, InstitutionServiceImpl institutionServiceImpl, DonationService donationService) {
        this.categoryService = categoryService;
        this.institutionServiceImpl = institutionServiceImpl;

        this.donationService = donationService;
    }


    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        List<Institution> institutions = institutionServiceImpl.getAll();
        model.addAttribute("institutions", institutions);
        model.addAttribute("donation", new Donation());
        return "/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String submit(Model model, Donation donation) {
        donationService.save(donation);
        return "form-confirmation";
    }

}
