package com.amedigital.challenge.controller;

import com.amedigital.challenge.domain.Planets;
import com.amedigital.challenge.dto.PlanetsDTO;
import com.amedigital.challenge.dto.PlanetDetailsDTO;
import com.amedigital.challenge.repository.PlanetsRepository;
import com.amedigital.challenge.service.PlanetsService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetsController {

    @Autowired
    private PlanetsService service;

    @Autowired
    private PlanetsRepository repository;

    @Transactional
    @Operation(summary = "Adicionar um planeta (com nome, clima e terreno)", method = "POST")
    @PostMapping
    public ResponseEntity<Planets> cadastrar (@RequestBody PlanetsDTO dto) {
        Planets newPlanet = service.cadastrar(dto);
        return new ResponseEntity<>(newPlanet, HttpStatus.CREATED);
    }
    @Operation(summary = "Listar todos os planetas", method = "GET")
    @GetMapping
    public ResponseEntity <List<Planets>> listar(){
        var planets = service.listar();
        return new ResponseEntity<>(planets, HttpStatus.OK);
    }

    @Transactional
    @Operation(summary = "Remover planetas pelo id", method = "DELETE")
    @DeleteMapping("/{id}")
    public ResponseEntity remover(@PathVariable Long id) throws Exception {
        service.removerById(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Buscar planetas pelo id", method = "GET")
    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id) throws Exception {
        var planet = service.findById(id);
        return ResponseEntity.ok(new PlanetDetailsDTO(planet));
    }
    @Operation(summary = "Buscar planetas pelo nome", method = "GET")
    @GetMapping("/{name}")
    public ResponseEntity findByName(@PathVariable String name) throws Exception {
        var planet = service.findByName(name);
        return ResponseEntity.ok(new PlanetDetailsDTO(planet));
    }

}
