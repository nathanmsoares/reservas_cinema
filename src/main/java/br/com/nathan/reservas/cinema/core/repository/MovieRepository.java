package br.com.nathan.reservas.cinema.core.repository;

import br.com.nathan.reservas.cinema.core.entity.Movie;

import java.util.List;

public interface MovieRepository {
    Movie save(Movie entity);
    Movie getById(Long id);
    List<Movie> findAll();
    void deleteAll();
}
