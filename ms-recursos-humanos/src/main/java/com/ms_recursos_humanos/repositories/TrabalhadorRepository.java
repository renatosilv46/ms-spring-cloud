package com.ms_recursos_humanos.repositories;

import com.ms_recursos_humanos.models.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {
}
