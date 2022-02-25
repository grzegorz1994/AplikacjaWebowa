package org.example.repository;

import org.example.repository.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Security, Long> {
}
