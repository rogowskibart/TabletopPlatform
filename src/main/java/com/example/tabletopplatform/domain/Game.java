package com.example.tabletopplatform.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer minPlayers;
    private Integer maxPlayers;
    private Integer minAge;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Publisher publisher;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        return id != null && id.equals(((Game) o).getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
