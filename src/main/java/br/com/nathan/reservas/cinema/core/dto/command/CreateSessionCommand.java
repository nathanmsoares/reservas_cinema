package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import br.com.nathan.reservas.cinema.core.entity.Session;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CreateSessionCommand {

    private Long id;
    @NotNull
    private Movie movie;
    @NotNull
    private LocalDateTime begin;
    @NotNull
    private LocalDateTime end;

    public CreateSessionCommand(Long id, Movie movie, LocalDateTime begin, LocalDateTime end) {
        this.id = id;
        this.movie = movie;
        this.begin = begin;
        this.end = end;
    }

    public Session toEntity() {
        return Session.builder()
                .id(id)
                .movie(movie)
                .begin(begin)
                .end(end)
                .build();
    }
}
