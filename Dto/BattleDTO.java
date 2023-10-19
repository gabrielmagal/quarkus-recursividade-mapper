package br.com.batalhasderimas.view.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BattleDTO {
    private int id;
    private int winner;
    private int loser;
    private int rounds;
    private LocalDate localDate;
    private String local;
    private TournamentDTO tournament;
}
