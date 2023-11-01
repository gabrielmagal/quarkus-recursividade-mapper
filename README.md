# quarkus-recursividade-mapper
![1](https://i.imgur.com/YxzV9Hp.jpg)

Este é um exemplo de uso de mapeamento para eliminar a recursividade entre objetos. Nesse cenário, temos a chamada de TournamentDTO, que por sua vez chama BattleDTO e vice-versa. Ou seja, temos um cenário em que um objeto chama o outro, causando assim uma recursividade. Quando se trata de entidades, o Panache consegue lidar com a recursividade de maneira eficaz. No entanto, ao transformar a entidade em um DTO usando o Mapper, a recursividade começa a ocorrer.

Para resolver esse problema, estou utilizando uma função configurada como "@Named("avoidRecursion")", na qual controlo o mapeamento da Battle, e então utilizo esse mapeamento no TournamentMapper, usando "@Mapper(uses = BattleMapper.class)". A partir do momento em que o mapeamento é iniciado, a recursividade é evitada.
