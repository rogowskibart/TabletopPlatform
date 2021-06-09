package com.example.tabletopplatform.api.v1.model;

import com.example.tabletopplatform.domain.Game;
import lombok.Data;

import java.util.Set;

@Data
public class PublisherDTO {
    private Long id;
    private String name;
    private Set<Game> games;
}
