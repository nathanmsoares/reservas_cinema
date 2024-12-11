package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.core.dto.command.CreateSessionCommand;
import br.com.nathan.reservas.cinema.core.repository.SessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateSessionUC {

    private final SessionRepository sessionRepository;

    public void execute(CreateSessionCommand command) {
        sessionRepository.save(command.toEntity());
    }
}
