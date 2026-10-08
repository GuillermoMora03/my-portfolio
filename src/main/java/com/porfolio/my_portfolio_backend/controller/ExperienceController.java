package com.porfolio.my_portfolio_backend.controller;


import com.porfolio.my_portfolio_backend.service.IExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/experience")
@RequiredArgsConstructor
public class ExperienceController {

    private final IExperienceService experienceService;
}
