package com.pruebasspringboot.demo.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class ListController {
    
    @GetMapping("/list-users")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
            new User("ayelmer", "brito"),
            new User("stivenson", "correa"),
            new User("elidallana","cristancho","elidallana@gmail.com")
        );
        model.addAttribute("title","Lista de usuarios");
        model.addAttribute("users", users);
        return "list";
    }
}
