package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.core.dto.command.CreateRoomCommand;
import br.com.nathan.reservas.cinema.core.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateRoomUC {

    private final RoomRepository roomRepository;

    public void execute(CreateRoomCommand command) {
        roomRepository.save(command.toEntity());
    }

}
