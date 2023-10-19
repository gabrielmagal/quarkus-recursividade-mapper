package br.com.batalhasderimas.view.dtos;

import br.com.batalhasderimas.controller.enums.TypeTournament;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TournamentDTO {
    private int id;
    private List<BattleDTO> battle;
    private TypeTournament typeTournament;
}
