package com.porfolio.my_portfolio_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndex(){
        System.out.println("Mostrando la página de inicio");
        return "index";
    }
}
