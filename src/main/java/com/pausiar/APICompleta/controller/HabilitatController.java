package com.pausiar.APICompleta.controller;

import com.pausiar.APICompleta.models.Entitats.Habilitat;
import com.pausiar.APICompleta.models.Repositoris.HabilitatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HabilitatController {

    @Autowired
    private HabilitatRepository habilitatRepository;

    // GET /api/habilitats -> llistar totes
    @GetMapping("/habilitats")
    public List<Habilitat> obtindreHabilitats() {
        return (List<Habilitat>) habilitatRepository.findAll();
    }

    // GET /api/habilitats/{id} -> obtindre una per id
    @GetMapping("/habilitats/{id}")
    public Habilitat obtindreHabilitatPerId(@PathVariable Long id) {
        return habilitatRepository.findById(id).orElse(null);
    }

    // POST /api/habilitats -> crear
    @PostMapping("/habilitats")
    public Habilitat afegirHabilitat(@RequestBody Habilitat habilitat) {
        return habilitatRepository.save(habilitat);
    }

    // PUT /api/habilitats/{id} -> actualitzar
    @PutMapping("/habilitats/{id}")
    public Habilitat actualitzarHabilitat(@PathVariable Long id, @RequestBody Habilitat habilitat) {
        if (!habilitatRepository.existsById(id)) {
            return null;
        }
        habilitat.setId(id);
        return habilitatRepository.save(habilitat);
    }

    // DELETE /api/habilitats/{id} -> eliminar
    @DeleteMapping("/habilitats/{id}")
    public void eliminarHabilitat(@PathVariable Long id) {
        habilitatRepository.deleteById(id);
    }
}
