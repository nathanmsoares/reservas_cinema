package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.core.dto.command.CreateChairCommand;
import br.com.nathan.reservas.cinema.core.repository.ChairRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateChairUC {

    private final ChairRepository chairRepository;

    public void execute(CreateChairCommand command) {
        chairRepository.save(command.toEntity());
    }

}
