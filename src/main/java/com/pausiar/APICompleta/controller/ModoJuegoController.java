package com.pausiar.APICompleta.controller;

import com.pausiar.APICompleta.models.Entitats.Mapa;
import com.pausiar.APICompleta.models.Repositoris.MapaRepository;
import com.pausiar.APICompleta.models.Entitats.ModoJuego;
import com.pausiar.APICompleta.models.Repositoris.ModoJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ModoJuegoController {

    @Autowired
    private ModoJuegoRepository modoJuegoRepository;

    @Autowired
    private MapaRepository mapaRepository;

    // GET /api/modosjuego -> llistar tots
    @GetMapping("/modosjuego")
    public List<ModoJuego> obtindreModos() {
        return (List<ModoJuego>) modoJuegoRepository.findAll();
    }

    // GET /api/modosjuego/{id} -> obtindre un per id
    @GetMapping("/modosjuego/{id}")
    public ModoJuego obtindreModoPerId(@PathVariable Long id) {
        return modoJuegoRepository.findById(id).orElse(null);
    }

    // POST /api/modosjuego -> crear
    @PostMapping("/modosjuego")
    public ModoJuego afegirModo(@RequestBody ModoJuego modoJuego) {
        return modoJuegoRepository.save(modoJuego);
    }

    // PUT /api/modosjuego/{id} -> actualitzar
    @PutMapping("/modosjuego/{id}")
    public ModoJuego actualitzarModo(@PathVariable Long id, @RequestBody ModoJuego modoJuego) {
        if (!modoJuegoRepository.existsById(id)) {
            return null;
        }
        modoJuego.setId(id);
        return modoJuegoRepository.save(modoJuego);
    }

    // DELETE /api/modosjuego/{id} -> eliminar
    @DeleteMapping("/modosjuego/{id}")
    @Transactional
    public void eliminarModo(@PathVariable Long id) {
        ModoJuego modoJuego = modoJuegoRepository.findById(id).orElse(null);
        if (modoJuego != null) {
            List<Mapa> mapes = mapaRepository.findByModoJuegoId(id);
            mapaRepository.deleteAll(mapes);
            modoJuegoRepository.deleteById(id);
        }
    }
}
