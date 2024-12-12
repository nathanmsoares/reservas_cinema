package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.TestcontainersConfiguration;
import br.com.nathan.reservas.cinema.core.dto.command.CreateChairCommand;
import br.com.nathan.reservas.cinema.core.entity.Chair;
import br.com.nathan.reservas.cinema.core.entity.Room;
import br.com.nathan.reservas.cinema.core.repository.ChairRepository;
import br.com.nathan.reservas.cinema.core.repository.RoomRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Objects;
import java.util.Optional;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CreateChairUCIT {

    @Autowired
    private CreateChairUC createChairUC;

    @Autowired
    private ChairRepository chairRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Test
    void createChair() {
        Assertions.assertEquals(0, chairRepository.findAll().size());
        Room room = roomRepository.save(Room.builder().name("1A").build());
        CreateChairCommand command = CreateChairCommand.builder()
                .room(room)
                .name("2B")
                .build();
        createChairUC.execute(command);
        Optional<Chair> chairFound = chairRepository.findAll().stream().findFirst();
        Assertions.assertTrue(chairFound.isPresent());
        Assertions.assertEquals(command.getName(), chairFound.get().getName());
        Assertions.assertTrue(Objects.nonNull(chairFound.get().getRoom()));
    }

}
