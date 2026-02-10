package com.pausiar.APICompleta.controller;

import com.pausiar.APICompleta.models.Entitats.Arma;
import com.pausiar.APICompleta.models.Repositoris.ArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArmaController {

    @Autowired
    private ArmaRepository armaRepository;

    // GET /api/armes -> llistar totes
    @GetMapping("/armes")
    public List<Arma> obtindreArmes() {
        return (List<Arma>) armaRepository.findAll();
    }

    // GET /api/armes/{id} -> obtindre una per id
    @GetMapping("/armes/{id}")
    public Arma obtindreArmaPerId(@PathVariable Long id) {
        return armaRepository.findById(id).orElse(null);
    }

    // POST /api/armes -> crear
    @PostMapping("/armes")
    public Arma afegirArma(@RequestBody Arma arma) {
        return armaRepository.save(arma);
    }

    // PUT /api/armes/{id} -> actualitzar
    @PutMapping("/armes/{id}")
    public Arma actualitzarArma(@PathVariable Long id, @RequestBody Arma arma) {
        if (!armaRepository.existsById(id)) {
            return null;
        }
        arma.setId(id);
        return armaRepository.save(arma);
    }

    // DELETE /api/armes/{id} -> eliminar
    @DeleteMapping("/armes/{id}")
    public void eliminarArma(@PathVariable Long id) {
        armaRepository.deleteById(id);
    }
}
