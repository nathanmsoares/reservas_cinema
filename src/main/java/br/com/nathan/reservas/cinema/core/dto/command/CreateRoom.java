package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;

import java.util.List;

public class CreateRoom {

    private Long id;
    private String name;
    private List<Chair> chairs;

    public CreateRoom(Long id, String name, List<Chair> chairs) {
        this.id = id;
        this.name = name;
        this.chairs = chairs;
    }

    public Room toEntity() {
        return Room.builder()
                .id(id)
                .name(name)
                .chairs(chairs)
                .build();
    }
}
