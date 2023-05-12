package com.solucaotecnologia.dslist.repositories;

import com.solucaotecnologia.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
