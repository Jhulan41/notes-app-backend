package com.jhulan.notesapp.repository.controller;

import com.jhulan.notesapp.entity.Notes;
import com.jhulan.notesapp.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NotesController {

    private final NoteService noteService;

    public NotesController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/newnote")
    public Notes createNotes(@RequestBody Notes notes){
        return noteService.createNotes(notes);
    }

    @GetMapping
    public List<Notes> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Notes getNotesById(@PathVariable Long id){
        return noteService.getNotesById(id);
    }

    @PutMapping("/{id}")
    public Notes updateNotes(@PathVariable Long id, @RequestBody Notes notes){
        return noteService.updateNotes(id,notes);
    }

    @DeleteMapping("/{id}")
    public void deleteNotesById(@PathVariable Long id){
         noteService.deleteNote(id);
    }

}
