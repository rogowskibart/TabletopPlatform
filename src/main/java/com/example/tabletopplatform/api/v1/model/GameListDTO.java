package com.example.tabletopplatform.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GameListDTO {
    private List<GameDTO> games;
}
