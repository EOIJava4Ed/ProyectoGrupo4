package com.eoi.ejemplospringboot.controllers;


import com.eoi.ejemplospringboot.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value={"","/"})
    public String mostrarIndex()
    {
        return "index";
    }

    @GetMapping("/holamundo")
    public String holaMundo(Model model)
    {
        model.addAttribute("saludo", "Hola que tal");
        return "holamundo.html";
    }


    @GetMapping("/login")
    public String login(Model model)
    {
        return "login";
    }


}
