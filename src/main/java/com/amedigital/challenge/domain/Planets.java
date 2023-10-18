package com.amedigital.challenge.domain;

import com.amedigital.challenge.dto.PlanetsDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "planets")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Planets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String climate;
    private String terrain;
    @Column(name = "film_count")
    private String filmCount;
    private Boolean active;

    public Planets(PlanetsDTO dto) {
        this.name = dto.name();
        this.climate = dto.climate();
        this.terrain = dto.terrain();
        this.filmCount = dto.filmCount();
        this.active = true;
    }

    public void excluir() {
        this.active = false;
    }

}
