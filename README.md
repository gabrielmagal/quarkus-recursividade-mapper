# quarkus-recursividade-mapper

Esse é um exemplo de uso de mapeamento removendo a recursividade entre os objetos.
Nesse cenário, temos a chamada de TournamentDTO que chama BattleDTO e vice versa.
Ou seja, temos um cenário onde um objeto chama o outro e com isso causando recursividade.
Se tratando de entidade, o Panache consegue se resolver quanto a recursividade, porém, ao transformar a entidade em DTO usando o Mapper, começa a tal recursividade.

Para resolver esse problema estou utilizando uma função setada como @Named("avoidRecursion") onde controlo o mapeamento da Battle e utilizo esse mapeamento no TournamentMapper utilizando @Mapper(uses = BattleMapper.class), que a partir do momento que iniciar o mapeamento evita a recursividade.
