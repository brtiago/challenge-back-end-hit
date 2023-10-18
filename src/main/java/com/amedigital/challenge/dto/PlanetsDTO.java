package com.amedigital.challenge.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record PlanetsDTO(
        @NotBlank
        String name,
        String climate,
        String terrain,
        String filmCount
) {
}
