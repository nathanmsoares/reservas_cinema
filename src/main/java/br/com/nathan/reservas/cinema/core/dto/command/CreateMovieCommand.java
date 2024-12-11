package br.com.nathan.reservas.cinema.core.dto.command;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.Duration;

@Data
@Builder
public class CreateMovieCommand {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Duration duration;

    public CreateMovieCommand(Long id, String name, Duration duration) {
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
