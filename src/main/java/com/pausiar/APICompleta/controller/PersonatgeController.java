package com.pausiar.APICompleta.controller;

import com.pausiar.APICompleta.models.Entitats.Habilitat;
import com.pausiar.APICompleta.models.Repositoris.HabilitatRepository;
import com.pausiar.APICompleta.models.Entitats.Personatge;
import com.pausiar.APICompleta.models.Repositoris.PersonatgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonatgeController {

    @Autowired
    private PersonatgeRepository personatgeRepository;

    @Autowired
    private HabilitatRepository habilitatRepository;

    // GET /api/personatges -> llistar tots
    @GetMapping("/personatges")
    public List<Personatge> obtindrePersonatges() {
        return (List<Personatge>) personatgeRepository.findAll();
    }

    // GET /api/personatges/{id} -> obtindre un per id
    @GetMapping("/personatges/{id}")
    public Personatge obtindrePersonatgePerId(@PathVariable Long id) {
        return personatgeRepository.findById(id).orElse(null);
    }

    // POST /api/personatges -> crear
    @PostMapping("/personatges")
    public Personatge afegirPersonatge(@RequestBody Personatge personatge) {
        return personatgeRepository.save(personatge);
    }

    // PUT /api/personatges/{id} -> actualitzar
    @PutMapping("/personatges/{id}")
    public Personatge actualitzarPersonatge(@PathVariable Long id, @RequestBody Personatge personatge) {
        if (!personatgeRepository.existsById(id)) {
            return null;
        }
        personatge.setId(id);
        return personatgeRepository.save(personatge);
    }

    // DELETE /api/personatges/{id} -> eliminar
    @DeleteMapping("/personatges/{id}")
    @Transactional
    public void eliminarPersonatge(@PathVariable Long id) {
        // Primero eliminar las habilidades asociadas
        Personatge personatge = personatgeRepository.findById(id).orElse(null);
        if (personatge != null) {
            List<Habilitat> habilitats = habilitatRepository.findByPersonatgeId(id);
            habilitatRepository.deleteAll(habilitats);
            personatgeRepository.deleteById(id);
        }
    }
}
