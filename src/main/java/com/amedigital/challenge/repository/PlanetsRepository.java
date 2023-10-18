package com.amedigital.challenge.repository;

import com.amedigital.challenge.domain.Planets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetsRepository extends JpaRepository<Planets, Long> {
}
