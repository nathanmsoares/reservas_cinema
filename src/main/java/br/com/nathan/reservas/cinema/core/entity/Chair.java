package br.com.nathan.reservas.cinema.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "chair")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Chair {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chair_seq")
    @SequenceGenerator(name = "chair_seq", sequenceName = "chair_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "created_time")
    @NotNull
    private final Instant createdTime = Instant.now();

}
