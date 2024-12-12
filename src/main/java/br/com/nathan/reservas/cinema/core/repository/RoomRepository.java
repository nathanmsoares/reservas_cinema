package br.com.nathan.reservas.cinema.core.repository;

import br.com.nathan.reservas.cinema.core.entity.Room;

import java.util.List;

public interface RoomRepository {
    Room save(Room entity);
    List<Room> findAll();
    void deleteAll();
}
