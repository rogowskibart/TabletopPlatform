package com.example.tabletopplatform.controllers.v1;

import com.example.tabletopplatform.api.v1.model.GameDTO;
import com.example.tabletopplatform.controllers.RestResponseEntityExceptionHandler;
import com.example.tabletopplatform.services.GameService;
import com.example.tabletopplatform.services.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class GameControllerTest {

    private static final Long GAME1_ID = 2L;
    private static final String GAME1_TITLE = "Imperium";
    private static final Integer GAME1_MIN_PLAYERS = 2;
    private static final Integer GAME1_MAX_PLAYERS = 6;
    private static final Integer GAME1_MIN_AGE = 18;
    private static final Long GAME2_ID = 3L;
    private static final String GAME2_TITLE = "Egipt";
    private static final Integer GAME2_MIN_PLAYERS = 1;
    private static final Integer GAME2_MAX_PLAYERS = 3;
    private static final Integer GAME2_MIN_AGE = 8;
    @Mock
    GameService gameService;

    @InjectMocks
    GameController gameController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(gameController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }


    @Test
    void getAllGames() throws Exception {

        GameDTO game1 = new GameDTO();
        game1.setId(GAME1_ID);
        game1.setTitle(GAME1_TITLE);
        game1.setMinPlayers(GAME1_MIN_PLAYERS);
        game1.setMaxPlayers(GAME1_MAX_PLAYERS);
        game1.setMinAge(GAME1_MIN_AGE);

        GameDTO game2 = new GameDTO();
        game2.setId(GAME2_ID);
        game2.setTitle(GAME2_TITLE);
        game2.setMinPlayers(GAME2_MIN_PLAYERS);
        game2.setMaxPlayers(GAME2_MAX_PLAYERS);
        game2.setMinAge(GAME2_MIN_AGE);

        List<GameDTO> games = Arrays.asList(game1, game2);

        when(gameService.getAllGames()).thenReturn(games);

        mockMvc.perform(get("/api/v1/games/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.games", hasSize(2)));
    }

    @Test
    void getGameByTitle() throws Exception {
        GameDTO game = new GameDTO();
        game.setId(GAME1_ID);
        game.setTitle(GAME1_TITLE);
        game.setMinPlayers(GAME1_MIN_PLAYERS);
        game.setMaxPlayers(GAME1_MAX_PLAYERS);
        game.setMinAge(GAME1_MIN_AGE);

        when(gameService.getGameByTitle(anyString())).thenReturn(game);

        mockMvc.perform(get("/api/v1/games/title/" + GAME1_TITLE)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", equalTo(GAME1_TITLE)));
    }

    @Test
    void getGameById() throws Exception {
        GameDTO game = new GameDTO();
        game.setId(GAME1_ID);
        game.setTitle(GAME1_TITLE);
        game.setMinPlayers(GAME1_MIN_PLAYERS);
        game.setMaxPlayers(GAME1_MAX_PLAYERS);
        game.setMinAge(GAME1_MIN_AGE);

        when(gameService.getGameById(anyLong())).thenReturn(game);

        mockMvc.perform(get("/api/v1/games/id/" + GAME1_ID)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", equalTo(GAME1_TITLE)));
    }

    @Test
    void testNotFoundException() throws Exception {

        when(gameService.getGameById(anyLong())).thenThrow(ResourceNotFoundException.class);

        mockMvc.perform(get("/api/v1/games/id/" + "658")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}