package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import br.com.nathan.reservas.cinema.core.entity.Session;

import java.time.LocalDateTime;

public class CreateSessionCommand {

    private Long id;
    private Movie movie;
    private LocalDateTime begin;
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
