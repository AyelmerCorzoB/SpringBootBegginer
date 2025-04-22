package com.pruebasspringboot.demo.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Models.User;


@Controller

public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("l1", "Home");
        model.addAttribute("l2", "Contact");
        model.addAttribute("l3", "About us");
        model.addAttribute("l4", "Form");

        model.addAttribute("titulo", "Home");
        model.addAttribute("desc", "Bienvenido a la página de inicio.");
        return "index";
    }

    @GetMapping("/home")
        public String home(Model model){

        User user = new User("Ayelmer","Corzo","alancorzo1512@gmail.com");
        Map<String,Object> body = new HashMap<>();
        
        body.put("titulo", "Error capa 8");
        body.put("autor", "Marck Zuckerberg");
        
        body.put("Nombre", user.getName());
        body.put("Apellido", user.getLastname());
        body.put("Correo", user.getEmail());

        model.addAttribute("body", body);
        return "home";
    }
    
}