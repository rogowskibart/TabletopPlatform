package com.example.tabletopplatform.domain;

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

    @OneToMany(mappedBy = "publisher", fetch = FetchType.EAGER)
    private Set<Game> games = new HashSet<>();
}
