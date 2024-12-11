package br.com.nathan.reservas.cinema.core.repository;

import br.com.nathan.reservas.cinema.core.entity.Chair;

public interface ChairRepository {
    Chair save(Chair command);
}
