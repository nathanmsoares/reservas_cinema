package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;

public class CreateChair {

    private Long id;
    private String name;
    private Room room;

    public CreateChair(Long id, String name, Room room) {
        this.id = id;
        this.name = name;
        this.room = room;
    }

    public Chair toEntity() {
        return Chair.builder()
                .id(id)
                .name(name)
                .room(room)
                .build();
    }
}
