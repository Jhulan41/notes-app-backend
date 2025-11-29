package com.jhulan.notesapp.service;

import com.jhulan.notesapp.entity.Notes;
import com.jhulan.notesapp.exception.NoteNotFoundException;
import com.jhulan.notesapp.repository.NotesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    private final NotesRepository notesRepository;

    public NoteServiceImpl(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @Override
    public Notes createNotes(Notes note) {
        return notesRepository.save(note);
    }

    @Override
    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }

    @Override
    public Notes getNotesById(Long id) {
        return notesRepository.findById(id).orElseThrow(() -> new NoteNotFoundException("Note not found with id " + id));
    }

    @Override
    public Notes updateNotes(Long id, Notes note) {
        Notes existing = getNotesById(id);
        existing.setTitle(note.getTitle());
        existing.setContent(note.getContent());
        return notesRepository.save(existing);
    }

    @Override
    public void deleteNote(Long id) {
        getNotesById(id);
        notesRepository.deleteById(id);
    }
}
