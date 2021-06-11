package com.example.tabletopplatform.controllers.v1;

import com.example.tabletopplatform.api.v1.model.GameDTO;
import com.example.tabletopplatform.api.v1.model.GameListDTO;
import com.example.tabletopplatform.services.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/games/")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<GameListDTO> getAllGames() {
        return new ResponseEntity<>(new GameListDTO(gameService.getAllGames()), HttpStatus.OK);
    }

    @GetMapping("{title}")
    public ResponseEntity<GameDTO> getGameByTitle(@PathVariable String title) {
        return new ResponseEntity<>(gameService.getGameByTitle(title), HttpStatus.OK);
    }
}
