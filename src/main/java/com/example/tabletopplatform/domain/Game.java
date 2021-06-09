package com.example.tabletopplatform.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer minPlayers;
    private Integer maxPlayers;
    private Integer minAge;

    @ManyToOne(fetch = FetchType.EAGER)
    private Publisher publisher;
}
