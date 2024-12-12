package br.com.nathan.reservas.cinema.core.dto.vm;

import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ChairVM {

    private Long id;
    private String name;
    private Room room;

    private ChairVM() {
    }

    public static ChairVM from(Chair chair) {
        return ChairVM.builder()
                .id(chair.getId())
                .name(chair.getName())
                .room(chair.getRoom())
                .build();
    }
}
