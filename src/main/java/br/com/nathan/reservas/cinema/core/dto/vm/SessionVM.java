package br.com.nathan.reservas.cinema.core.dto.vm;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import br.com.nathan.reservas.cinema.core.entity.Session;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class SessionVM {

    private Long id;
    private Movie movie;
    private LocalDateTime begin;
    private LocalDateTime end;

    private SessionVM() {
    }

    public static SessionVM from(Session session) {
        return SessionVM.builder()
                .id(session.getId())
                .begin(session.getBegin())
                .end(session.getEnd())
                .movie(session.getMovie())
                .build();
    }
}
