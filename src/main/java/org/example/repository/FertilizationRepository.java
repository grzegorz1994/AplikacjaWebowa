package org.example.repository;

import org.example.repository.entity.Fertilization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FertilizationRepository extends JpaRepository<Fertilization, Long> {
}
