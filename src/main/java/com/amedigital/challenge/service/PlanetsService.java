package com.amedigital.challenge.service;

import com.amedigital.challenge.domain.Planets;
import com.amedigital.challenge.dto.PlanetsDTO;
import com.amedigital.challenge.repository.PlanetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetsService {

    @Autowired
    private PlanetsRepository repository;

    public Planets cadastrar(PlanetsDTO dto) {
        Planets newPlanet = new Planets(dto);
        this.savePlanet(newPlanet);
        return newPlanet;
    }

    public Planets findById(Long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("ID de Planeta não encontrado"));
    }

    public Planets findByName(String name) throws Exception{
        return repository.findByName(name).orElseThrow(() -> new Exception("Planeta não encontrado"));
    }

    public void removerById(Long id) throws Exception {
        Planets planet = findById(id);
        planet.excluir();
    }

    public List<Planets> listar(){
        return this.repository.findAll();
    }

    public void savePlanet(Planets planet){
        this.repository.save(planet);
    }
}