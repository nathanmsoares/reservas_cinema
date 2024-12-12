package br.com.nathan.reservas.cinema.core.dto.vm;

import br.com.nathan.reservas.cinema.core.entity.Movie;
import lombok.Builder;
import lombok.Data;

import java.time.Duration;

@Builder
@Data
public class MovieVM {

    private Long id;
    private String name;
    private Duration duration;

    private MovieVM() {
    }

    public static MovieVM from(Movie movie) {
        return MovieVM.builder()
                .id(movie.getId())
                .name(movie.getName())
                .duration(movie.getDuration())
                .build();
    }

}
