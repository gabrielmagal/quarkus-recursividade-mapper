package br.com.batalhasderimas.model.entity;

import br.com.batalhasderimas.controller.enums.TypeTournament;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class TournamentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "tournament")
    private List<BattleEntity> battle;

    private TypeTournament typeTournament;
}
