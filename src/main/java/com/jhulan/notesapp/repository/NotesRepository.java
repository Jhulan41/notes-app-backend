package com.jhulan.notesapp.repository;

import com.jhulan.notesapp.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {
}
