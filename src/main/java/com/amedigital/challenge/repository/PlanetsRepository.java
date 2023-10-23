package com.amedigital.challenge.repository;

import com.amedigital.challenge.domain.Planets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlanetsRepository extends JpaRepository<Planets, Long> {
    Optional<Planets> findByName(String name);
}
