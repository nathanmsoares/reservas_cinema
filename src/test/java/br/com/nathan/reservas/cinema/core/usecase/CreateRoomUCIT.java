package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.TestcontainersConfiguration;
import br.com.nathan.reservas.cinema.core.dto.command.CreateRoomCommand;
import br.com.nathan.reservas.cinema.core.repository.RoomRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CreateRoomUCIT {

    @Autowired
    private CreateRoomUC createRoomUC;

    @Autowired
    private RoomRepository roomRepository;

    @AfterEach
    void tearDown() {
        roomRepository.deleteAll();
    }

    @Test
    void createRoomWithoutChairs() {
        Assertions.assertEquals(0, roomRepository.findAll().size());
        CreateRoomCommand command = CreateRoomCommand.builder()
                .name("1A")
                .build();
        createRoomUC.execute(command);
        Assertions.assertEquals(1, roomRepository.findAll().size());
    }

}
