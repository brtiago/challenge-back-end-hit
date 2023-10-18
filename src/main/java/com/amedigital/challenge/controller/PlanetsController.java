package com.amedigital.challenge.controller;

import com.amedigital.challenge.dto.PlanetsDTO;
import com.amedigital.challenge.service.PlanetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planets")
public class PlanetsController {

    @Autowired
    private PlanetsService service;

    @PostMapping
    public void cadastrar(@RequestBody PlanetsDTO dto) {
        service.cadastrar(dto);
    }

}
