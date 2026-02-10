package com.pausiar.APICompleta.models.Repositoris;

import com.pausiar.APICompleta.models.Entitats.Mapa;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MapaRepository extends CrudRepository<Mapa, Long> {
    List<Mapa> findByModoJuegoId(Long modoJuegoId);
}
