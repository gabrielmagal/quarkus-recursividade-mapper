package br.com.batalhasderimas.controller.interfaces.mappers;

import br.com.batalhasderimas.model.entity.BattleEntity;
import br.com.batalhasderimas.model.entity.TournamentEntity;
import br.com.batalhasderimas.view.dtos.BattleDTO;
import br.com.batalhasderimas.view.dtos.TournamentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BattleMapper extends MapperImpl<BattleDTO, BattleEntity> {
    BattleMapper INSTANCE = Mappers.getMapper(BattleMapper.class);

    @Mapping(target = "tournament", qualifiedByName = "avoidRecursion")
    BattleDTO toDto(BattleEntity battleEntity);

    @Named("avoidRecursion")
    default TournamentDTO avoidRecursion(TournamentEntity tournamentEntity) {
        if (tournamentEntity != null) {
            TournamentDTO tournamentDTO = new TournamentDTO();
            tournamentDTO.setId(tournamentEntity.getId());
            return tournamentDTO;
        }
        return null;
    }

    @Override
    BattleEntity toEntity(BattleDTO battleDTO);
}