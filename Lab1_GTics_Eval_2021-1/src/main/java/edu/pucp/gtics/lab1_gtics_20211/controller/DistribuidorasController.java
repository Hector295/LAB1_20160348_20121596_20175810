package edu.pucp.gtics.lab1_gtics_20211.controller;

import edu.pucp.gtics.lab1_gtics_20211.entity.Distribuidoras;
import edu.pucp.gtics.lab1_gtics_20211.repository.DistribuidorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/distribuidoras")
public class DistribuidorasController {

    @Autowired
    DistribuidorasRepository distribuidorasRepository;

    @GetMapping(value="/lista")
    public String listaDistribuidoras (Model model){
        model.addAttribute("lista", distribuidorasRepository.findAll());
        return "distribuidoras/lista";
    }

    @GetMapping("/editar")
    public String editarDistribuidoras(@RequestParam("id") int id,
                                       Model model){
        Optional<Distribuidoras> shipperOpt = distribuidorasRepository.findById(id);

        if (shipperOpt.isPresent()) {
            Distribuidoras distribuidoraAEditar = shipperOpt.get();
            model.addAttribute("distribuidoraAEditar", distribuidoraAEditar);
            return "distribuidoras/editar";
        } else {
            return "redirect:/distribuidoras";
        }
    }

    @GetMapping("/nuevaDistribuidora")
    public String nuevaDistribuidora(){
        return "distribuidoras/nuevo";
    }

    @PostMapping("/guardar")
    public String guardarDistribuidora(Distribuidoras distribuidoras){
        distribuidorasRepository.save(distribuidoras);
        return "redirect:/distribuidoras";
    }

    @GetMapping("/borrar")
    public String borrarDistribuidora(@RequestParam("id") int id){
        Optional<Distribuidoras>  opt = distribuidorasRepository.findById(id);
        if (opt.isPresent()) {
            distribuidorasRepository.deleteById(id);
        }
        return "redirect:/distribuidoras";
    }
}
