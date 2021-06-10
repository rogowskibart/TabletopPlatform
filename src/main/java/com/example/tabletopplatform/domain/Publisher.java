package com.example.tabletopplatform.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @OneToMany(
            mappedBy = "publisher",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonBackReference
    private Set<Game> games = new HashSet<>();

    public void addGame(Game game) {
        games.add(game);
        game.setPublisher(this);
    }

    public void removeGame(Game game) {
        games.remove(game);
        game.setPublisher(null);
    }
}
