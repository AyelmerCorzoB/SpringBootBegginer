package com.pruebasspringboot.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("l1", "Home");
        model.addAttribute("l2", "Contact");
        model.addAttribute("l3", "About us");
        model.addAttribute("l4", "Form");

        model.addAttribute("title", "Home");
        model.addAttribute("desc", "Bienvenido a la página de inicio.");
        return "index";
    }
}