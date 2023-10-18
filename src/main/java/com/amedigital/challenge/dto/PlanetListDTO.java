package com.amedigital.challenge.dto;


import com.amedigital.challenge.domain.Planets;

public record PlanetListDTO(Long id, String name, String climate, String terrain, String filmCount) {
    public PlanetListDTO (Planets planet){
        this(planet.getId(), planet.getName(), planet.getClimate(), planet.getTerrain(), planet.getFilmCount());
    }
}
