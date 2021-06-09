package com.example.tabletopplatform.api.v1.mapper;

import com.example.tabletopplatform.api.v1.model.GameDTO;
import com.example.tabletopplatform.domain.Game;
import com.example.tabletopplatform.domain.Publisher;
import org.junit.jupiter.api.Test;

import javax.persistence.ManyToOne;

import static org.junit.jupiter.api.Assertions.*;

class GameMapperImplTest {

    public static final long ID = 1L;
    public static final String PUBLISHER_NAME = "Days of wonder";
    public static final String TITLE = "Five Tribes";
    public static final Integer MIN_PLAYERS = 2;
    public static final Integer MAX_PLAYERS = 4;
    public static final Integer MIN_AGE = 13;
    GameMapper gameMapper = GameMapper.INSTANCE;

    @Test
    void gameToGameDTO() {

        //given
        Publisher publisher = new Publisher();
        publisher.setName(PUBLISHER_NAME);
        publisher.setId(ID);

        Game game = new Game();
        game.setId(ID);
        game.setTitle(TITLE);
        game.setMinPlayers(MIN_PLAYERS);
        game.setMaxPlayers(MAX_PLAYERS);
        game.setMinAge(MIN_AGE);
        game.setPublisher(publisher);

        //when
        GameDTO gameDTO = gameMapper.gameToGameDTO(game);

        //then
        assertEquals(Long.valueOf(ID), gameDTO.getId());
        assertEquals(TITLE, gameDTO.getTitle());
        assertEquals(MIN_PLAYERS, gameDTO.getMinPlayers());
        assertEquals(MAX_PLAYERS, gameDTO.getMaxPlayers());
        assertEquals(MIN_AGE, gameDTO.getMinAge());
        assertEquals(publisher, gameDTO.getPublisher());
    }
}