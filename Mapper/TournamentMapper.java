package br.com.batalhasderimas.controller.interfaces.mappers;

import br.com.batalhasderimas.model.entity.TournamentEntity;
import br.com.batalhasderimas.view.dtos.TournamentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = BattleMapper.class)
public interface TournamentMapper extends MapperImpl<TournamentDTO, TournamentEntity> {
    TournamentMapper INSTANCE = Mappers.getMapper(TournamentMapper.class);

    @Override
    TournamentDTO toDto(TournamentEntity tournamentEntity);

    @Override
    TournamentEntity toEntity(TournamentDTO tournamentDTO);
}