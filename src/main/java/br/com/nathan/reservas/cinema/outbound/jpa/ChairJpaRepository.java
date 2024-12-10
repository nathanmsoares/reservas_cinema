package br.com.nathan.reservas.cinema.outbound.jpa;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.repository.ChairRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairJpaRepository extends JpaRepository<Chair, Long>, ChairRepository {
}
