package com.jhulan.notesapp.service;

import com.jhulan.notesapp.entity.Notes;

import java.util.List;

public interface NoteService {
    Notes createNotes(Notes note);
    List<Notes> getAllNotes();
    Notes getNotesById(Long id);
    Notes updateNotes(Long id, Notes note);
    void deleteNote(Long id);

}
