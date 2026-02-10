package com.pausiar.APICompleta.models.Repositoris;

import com.pausiar.APICompleta.models.Entitats.Habilitat;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface HabilitatRepository extends CrudRepository<Habilitat, Long> {
    List<Habilitat> findByPersonatgeId(Long personatgeId);
}
