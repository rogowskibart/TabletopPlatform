package com.example.tabletopplatform.api.v1.mapper;

import com.example.tabletopplatform.api.v1.model.GameDTO;
import com.example.tabletopplatform.domain.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    @Mapping(source = "id", target = "id")
    GameDTO gameToGameDTO(Game game);
}
