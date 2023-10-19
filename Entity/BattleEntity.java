package br.com.batalhasderimas.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class BattleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int winner;
    private int loser;
    private int rounds;
    private LocalDate localDate;
    private String local;

    @ManyToOne
    @JoinColumn(name = "tournamentEntity_id")
    private TournamentEntity tournament;
}
