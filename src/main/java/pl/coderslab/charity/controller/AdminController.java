package pl.coderslab.charity.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Institution;

import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;
import pl.coderslab.charity.repository.UserRepository;
import pl.coderslab.charity.service.InstitutionService;
import pl.coderslab.charity.service.UserService;

import javax.validation.Valid;


@Controller
@RequestMapping("/admin")
public class AdminController { //strefa chroniona skonfigurowana w SecurityConfig
    private final UserService userService;

    private final InstitutionService institutionService;
    private final CategoryRepository categoryRepository;
    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final UserRepository userRepository;

    public AdminController(UserService userService, InstitutionService institutionService, CategoryRepository categoryRepository, DonationRepository donationRepository, InstitutionRepository institutionRepository, UserRepository userRepository) {
        this.userService = userService;
        this.institutionService = institutionService;
        this.categoryRepository = categoryRepository;
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.userRepository = userRepository;
    }

    //    @RequestMapping("")
//    @PreAuthorize("hasRole('ADMIN')")
//    public String index(@AuthenticationPrincipal UserDetails user, Model model){
//        model.addAttribute("user",service.findByEmail(userDto.getEmail()));
//        return "admin/index";
//    }
//@GetMapping(value = "/institution/delete")
//public String delete(Institution institution) {
//    institutionService.deleteInstitutionById(institutionService.getId());
//    return "redirect:/admin/list";
//}

//    @GetMapping(value = "/institution/edit")
//    public String editInstitution(Institution institution, Model model) {
//        model.addAttribute("institution", institutionService.get(institution.getId()).get());
//        return "institution-edit";
//    }

    @PostMapping(value = "/institution/edit")
    public String editInst(@Valid Institution institution, BindingResult result) {
        if (!result.hasErrors()) {
            institutionService.update(institution);
            return "redirect:/user";
        }
        return "user-edit";
    }
    @GetMapping(value = "/institution/add")
    public String addInstitution(Institution institution, Model model) {
        model.addAttribute("institution", institution);
        return "institution-form";
    }

    @PostMapping(value = "/institution/add")
    public String addInst(@Valid Institution institution, BindingResult result) {
        if (!result.hasErrors()) {
            institutionService.add(institution);
            return "redirect:/list";
        }
        return "institution-form";
    }
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("institutions", institutionRepository.findAll());
//        model.addAttribute("users", userRepository.findAll());
//        model.addAttribute("donations", donationRepository.findAll());
//        model.addAttribute("categories", categoryRepository.findAll());
        return "list";
    }
}
