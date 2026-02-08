package com.pausiar.APICompleta.controller;

import com.pausiar.APICompleta.models.Mapa;
import com.pausiar.APICompleta.models.MapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MapaController {

    @Autowired
    private MapaRepository mapaRepository;

    // GET /api/mapes -> llistar tots
    @GetMapping("/mapes")
    public List<Mapa> obtindreMapes() {
        return (List<Mapa>) mapaRepository.findAll();
    }

    // GET /api/mapes/{id} -> obtindre un per id
    @GetMapping("/mapes/{id}")
    public Mapa obtindreMapaPerId(@PathVariable Long id) {
        return mapaRepository.findById(id).orElse(null);
    }

    // POST /api/mapes -> crear
    @PostMapping("/mapes")
    public Mapa afegirMapa(@RequestBody Mapa mapa) {
        return mapaRepository.save(mapa);
    }

    // PUT /api/mapes/{id} -> actualitzar
    @PutMapping("/mapes/{id}")
    public Mapa actualitzarMapa(@PathVariable Long id, @RequestBody Mapa mapa) {
        if (!mapaRepository.existsById(id)) {
            return null;
        }
        mapa.setId(id);
        return mapaRepository.save(mapa);
    }

    // DELETE /api/mapes/{id} -> eliminar
    @DeleteMapping("/mapes/{id}")
    public void eliminarMapa(@PathVariable Long id) {
        mapaRepository.deleteById(id);
    }
}
