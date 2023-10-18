package com.amedigital.challenge.service;

import com.amedigital.challenge.domain.Planets;
import com.amedigital.challenge.dto.PlanetsDTO;
import com.amedigital.challenge.repository.PlanetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetsService {

    @Autowired
    private PlanetsRepository repository;

    public void cadastrar(PlanetsDTO dto) {
        System.out.println("Planeta cadastrado: ");
        System.out.printf("Nome: %s\nClima: %s\nTerreno: %s\nFilmes: %s", dto.name(), dto.climate(), dto.terrain(), dto.filmCount());
        repository.save(new Planets(dto));
    }
}