package com.pausiar.APICompleta.models;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface HabilitatRepository extends CrudRepository<Habilitat, Long> {
    List<Habilitat> findByPersonatgeId(Long personatgeId);
}
