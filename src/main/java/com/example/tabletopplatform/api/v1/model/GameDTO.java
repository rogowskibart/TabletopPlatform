package com.example.tabletopplatform.api.v1.model;

import com.example.tabletopplatform.domain.Publisher;
import lombok.Data;

@Data
public class GameDTO {
    private Long id;
    private String title;
    private Integer minPlayers;
    private Integer maxPlayers;
    private Integer minAge;
    private Publisher publisher;
}
