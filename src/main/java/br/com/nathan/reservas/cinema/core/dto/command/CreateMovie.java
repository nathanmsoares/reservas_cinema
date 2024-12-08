package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import lombok.Getter;

import java.time.LocalTime;

@Getter
public class CreateMovie {

    private Long id;

    private String name;

    private LocalTime duration;

    public CreateMovie(Long id, String name, LocalTime duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public Movie toEntity() {
        return Movie.builder()
                .id(id)
                .name(name)
                .duration(duration)
                .build();
    }
}
