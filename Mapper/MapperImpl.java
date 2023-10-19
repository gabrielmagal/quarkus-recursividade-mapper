package br.com.batalhasderimas.controller.interfaces.mappers;

import java.util.List;

public interface MapperImpl <D, E> {
    D toDto(E person);
    List<D> toDtos(List<E> persons);
    E toEntity(D person);
    List<E> toEntities(List<D> persons);
}