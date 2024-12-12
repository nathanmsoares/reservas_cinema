package br.com.nathan.reservas.cinema.core.dto.vm;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class RoomVM {

    private Long id;
    private String name;
    private List<Chair> chairs;

    private RoomVM() {
    }

    public static RoomVM from(Room room) {
        return RoomVM.builder()
                .id(room.getId())
                .name(room.getName())
                .chairs(room.getChairs())
                .build();
    }
}
