package br.com.nathan.reservas.cinema.core.usecase;

import br.com.nathan.reservas.cinema.TestcontainersConfiguration;
import br.com.nathan.reservas.cinema.core.dto.command.CreateMovieCommand;
import br.com.nathan.reservas.cinema.core.repository.MovieRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.time.Duration;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CreateMovieUCIT {

    @Autowired
    private CreateMovieUC createMovieUC;

    @Autowired
    private MovieRepository movieRepository;

    @AfterEach
    void tearDown() {
        movieRepository.deleteAll();
    }

    @Test
    void createMovie() {
        Assertions.assertEquals(0, movieRepository.findAll().size());
        CreateMovieCommand command = CreateMovieCommand.builder()
                .duration(Duration.ofHours(1).plusMinutes(30))
                .name("Movie name")
                .build();
        createMovieUC.execute(command);
        Assertions.assertEquals(1, movieRepository.findAll().size());
    }

}
