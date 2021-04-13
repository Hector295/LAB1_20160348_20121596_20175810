package edu.pucp.gtics.lab1_gtics_20211.controller;

import edu.pucp.gtics.lab1_gtics_20211.repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/juegos")
public class JuegosController {

    @Autowired
    JuegosRepository juegosRepository;

    @GetMapping("/listaJuegos")
    public String listaJuegos(Model model) {
        model.addAttribute("listaJuegos", juegosRepository.findAll());
        return "juegos/lista";
    }

    public String editarJuegos() {


    }

    public String guardarJuegos() {

    }


}
