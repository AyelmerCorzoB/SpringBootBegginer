package com.pruebasspringboot.demo.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Models.UsuarioMario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @ModelAttribute("characteres")
    public List<String> characteres() {
        return Arrays.asList("Mario", "Luigi", "Peach", "Toad", "Yoshi", "Bowser", "Wario", "Waluigi", "Donkey Kong", "Daisy", "Rosalina", "Koopa Troopa",
                "Shy Guy", "Goomba", "Bob-omb", "Dry Bones", "Birdo", "Kamek", "Hammer Bro", "Lakitu");
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("l1", "Home");
        model.addAttribute("l2", "Contact");
        model.addAttribute("l3", "About us");
        model.addAttribute("l4", "Form");
        model.addAttribute("usuario", new UsuarioMario());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute UsuarioMario usuario, Model model) {
        model.addAttribute("mensaje", "Usuario guardado: " + usuario.getNombre());
        model.addAttribute("l1", "Home");
        model.addAttribute("l2", "Contact");
        model.addAttribute("l3", "About us");
        model.addAttribute("l4", "Form");
        return "formulario";
    }
}