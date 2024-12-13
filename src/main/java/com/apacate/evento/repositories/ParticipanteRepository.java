package com.apacate.evento.repositories;

import com.apacate.evento.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository <Participante, Long> {
}
