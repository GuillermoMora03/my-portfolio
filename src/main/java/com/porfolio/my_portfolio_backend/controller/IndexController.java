package com.porfolio.my_portfolio_backend.controller;

import com.porfolio.my_portfolio_backend.service.IEducationService;
import com.porfolio.my_portfolio_backend.service.IExperienceService;
import com.porfolio.my_portfolio_backend.service.IPersonalInfoService;
import com.porfolio.my_portfolio_backend.service.ISkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final IPersonalInfoService personalInfoService;
    private final IEducationService educationService;
    private final ISkillService skillService;
    private final IExperienceService experienceService;

    @GetMapping("/")
    public String showIndex(Model model) {
        System.out.println("Mostrando la página de inicio");

        model.addAttribute("personalInfo", personalInfoService.findAll());
        model.addAttribute("education", educationService.findAll());
        model.addAttribute("skills", skillService.findAll());
        model.addAttribute("experience", experienceService.findAll());

        return "index";
    }
}
