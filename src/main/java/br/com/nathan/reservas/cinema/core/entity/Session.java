package br.com.nathan.reservas.cinema.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "session")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_seq")
    @SequenceGenerator(name = "room_seq", sequenceName = "room_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @NotNull
    @Column(name = "begin_hour_date")
    private LocalDateTime begin;

    @NotNull
    @Column(name = "end_hour_date")
    private LocalDateTime end;

    @Column(name = "created_time")
    @NotNull
    private final Instant createdTime = Instant.now();

}
