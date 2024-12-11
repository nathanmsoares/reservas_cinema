package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateChairCommand {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Room room;

    public CreateChairCommand(Long id, String name, Room room) {
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
