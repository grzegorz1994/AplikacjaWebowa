package org.example.repository;

import org.example.repository.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {
}
