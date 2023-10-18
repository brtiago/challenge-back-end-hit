package com.amedigital.challenge.dto;

import com.amedigital.challenge.domain.Planets;

public record PlanetDetailsDTO(
        Long id,
        String name,
        String climate,
        String terrain,
        String filmCount
) {
    public PlanetDetailsDTO(Planets planet) {
        this(planet.getId(), planet.getName(), planet.getClimate(), planet.getTerrain(), planet.getFilmCount());
    }
}
