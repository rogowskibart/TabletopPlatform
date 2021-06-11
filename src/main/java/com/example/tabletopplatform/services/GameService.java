package com.example.tabletopplatform.services;

import com.example.tabletopplatform.api.v1.model.GameDTO;

import java.util.List;

public interface GameService {

    List<GameDTO> getAllGames();

    GameDTO getGameByTitle(String title);
}
