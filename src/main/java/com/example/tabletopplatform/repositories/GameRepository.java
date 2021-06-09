package com.example.tabletopplatform.repositories;

import com.example.tabletopplatform.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

    Game findByTitle(String title);
}
