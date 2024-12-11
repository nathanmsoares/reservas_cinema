package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.core.dto.command.CreateMovieCommand;
import br.com.nathan.reservas.cinema.core.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateMovieUC {

    private final MovieRepository movieRepository;

    public void execute(CreateMovieCommand command) {
        movieRepository.save(command.toEntity());
    }
}
