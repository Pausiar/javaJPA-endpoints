package com.pausiar.APIinicial.controller;

import com.pausiar.APIinicial.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/llistats")
public class MVCController {

    @Autowired
    private ModoJuegoRepository modoJuegoRepository;

    @Autowired
    private MapaRepository mapaRepository;

    @Autowired
    private PersonatgeRepository personatgeRepository;

    @Autowired
    private HabilitatRepository habilitatRepository;

    @Autowired
    private ArmaRepository armaRepository;

    @GetMapping("/modos")
    public String llistatModos(Model model) {
        List<ModoJuego> modosList = (List<ModoJuego>) modoJuegoRepository.findAll();
        model.addAttribute("modos", modosList);
        return "LlistatModos";
    }

    @GetMapping("/mapes")
    public String llistatMapes(Model model) {
        List<Mapa> mapesList = (List<Mapa>) mapaRepository.findAll();
        model.addAttribute("mapes", mapesList);
        return "LlistatMapes";
    }

    @GetMapping("/personatges")
    public String llistatPersonatges(Model model) {
        List<Personatge> personatgesList = (List<Personatge>) personatgeRepository.findAll();
        model.addAttribute("personatges", personatgesList);
        return "LlistatPersonatges";
    }

    @GetMapping("/habilitats")
    public String llistatHabilitats(Model model) {
        List<Habilitat> habilitatsList = (List<Habilitat>) habilitatRepository.findAll();
        model.addAttribute("habilitats", habilitatsList);
        return "LlistatHabilitats";
    }

    @GetMapping("/armes")
    public String llistatArmes(Model model) {
        List<Arma> armesList = (List<Arma>) armaRepository.findAll();
        model.addAttribute("armes", armesList);
        return "LlistatArmes";
    }
}
