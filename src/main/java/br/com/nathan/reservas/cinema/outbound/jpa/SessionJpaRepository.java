package br.com.nathan.reservas.cinema.outbound.jpa;

import br.com.nathan.reservas.cinema.core.entity.Session;
import br.com.nathan.reservas.cinema.core.repository.SessionRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionJpaRepository extends JpaRepository<Session, Long>, SessionRepository {
}
