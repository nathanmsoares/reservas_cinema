package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreateRoomCommand {

    private Long id;
    @NotNull
    private String name;
    private List<Chair> chairs;

    public CreateRoomCommand(Long id, String name, List<Chair> chairs) {
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
