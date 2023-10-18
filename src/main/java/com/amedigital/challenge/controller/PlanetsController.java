package com.amedigital.challenge.controller;

import com.amedigital.challenge.dto.PlanetListDTO;
import com.amedigital.challenge.dto.PlanetsDTO;
import com.amedigital.challenge.dto.PlanetDetailsDTO;
import com.amedigital.challenge.repository.PlanetsRepository;
import com.amedigital.challenge.service.PlanetsService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planets")
public class PlanetsController {

    @Autowired
    private PlanetsService service;

    @Autowired
    private PlanetsRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@RequestBody PlanetsDTO dto) {
        service.cadastrar(dto);
    }

    @GetMapping
    public ResponseEntity <Page<PlanetListDTO>> listar(Pageable paginacao){
        var page = repository.findAll(paginacao).map(PlanetListDTO::new);
        return ResponseEntity.ok(page);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity remover(@PathVariable Long id){
        var planet = repository.getReferenceById(id);
        planet.excluir();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var planet = repository.getReferenceById(id);
        return ResponseEntity.ok(new PlanetDetailsDTO(planet));
    }

}
