package br.com.nathan.reservas.cinema.outbound.jpa;

import br.com.nathan.reservas.cinema.core.entity.Room;
import br.com.nathan.reservas.cinema.core.repository.RoomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Long>, RoomRepository {
}
