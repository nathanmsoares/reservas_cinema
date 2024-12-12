package br.com.nathan.reservas.cinema.core.repository;

import br.com.nathan.reservas.cinema.core.entity.Chair;

import java.util.List;

public interface ChairRepository {
    Chair save(Chair command);
    void deleteAll();
    List<Chair> findAll();
}
