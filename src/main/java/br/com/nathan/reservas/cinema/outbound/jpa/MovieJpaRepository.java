package br.com.nathan.reservas.cinema.outbound.jpa;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import br.com.nathan.reservas.cinema.core.repository.MovieRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieJpaRepository extends JpaRepository<Movie, Long>, MovieRepository {
}
