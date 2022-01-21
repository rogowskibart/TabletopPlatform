package com.example.tabletopplatform.services;

import com.example.tabletopplatform.api.v1.mapper.GameMapper;
import com.example.tabletopplatform.api.v1.model.GameDTO;
import com.example.tabletopplatform.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService {

    private final GameMapper gameMapper;
    private final GameRepository gameRepository;

    public GameServiceImpl(GameMapper gameMapper, GameRepository gameRepository) {
        this.gameMapper = gameMapper;
        this.gameRepository = gameRepository;
    }

    @Override
    public List<GameDTO> getAllGames() {
        return gameRepository.findAll()
                .stream()
                .map(gameMapper::gameToGameDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GameDTO getGameByTitle(String title) {
        return gameMapper.gameToGameDTO(gameRepository.findByTitle(title));
    }

    @Override
    public GameDTO getGameById(Long id) {
        return gameRepository.findById(id)
                .map(gameMapper::gameToGameDTO)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
