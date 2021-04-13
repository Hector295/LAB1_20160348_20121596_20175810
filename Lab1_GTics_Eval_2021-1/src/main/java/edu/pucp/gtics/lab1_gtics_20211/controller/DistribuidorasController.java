package edu.pucp.gtics.lab1_gtics_20211.controller;

import edu.pucp.gtics.lab1_gtics_20211.repository.DistribuidorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/distribuidoras")
public class DistribuidorasController {

    @Autowired
    DistribuidorasRepository distribuidorasRepository;

    @GetMapping("/lista")
    public String listaDistribuidoras (Model model){
        model.addAttribute("lista", distribuidorasRepository.findAll());
        return "distribuidoras/lista";
    }

    public String editarDistribuidoras(){

    }

    public String nuevaDistribuidora(){

    }
    @PostMapping("/guardar")
    public String guardarDistribuidora(){

    }

    public String borrarDistribuidora(){

    }

}
