package com.solucaotecnologia.dslist.repositories;

import com.solucaotecnologia.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
