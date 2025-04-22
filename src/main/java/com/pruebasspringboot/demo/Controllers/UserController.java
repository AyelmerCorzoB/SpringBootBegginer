package com.pruebasspringboot.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Models.User;
import com.Models.Dtos.UserDto;


@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Ayelmer","Corzo","alancorzo1512@gmail.com");
        userDto.setTitle("Ingeniero en sistemas FullStack");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list")
    public List<User> listaUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Erling", "MeLaHaland", "erling@manchester.com"));
        users.add(new User("AlanBrito", "BritousKy", "brito@freefire.com"));
        return users;
    }
    
    
}
