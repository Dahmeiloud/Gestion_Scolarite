package com.smart.projetsmart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smart.projetsmart.entity.Notes;
import com.smart.projetsmart.repostory.NoteRepository;

@Service
public class NoteService {
 
    @Autowired
    private  NoteRepository noteRepository;

   public  ResponseEntity<Object> createNotes(Notes notes) {
        try {
            noteRepository.save(notes);
            return ResponseEntity.ok().body("Note created successfully");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    public  ResponseEntity<Notes> updateN( Notes notes , long id) {
        Optional<Notes> optionalNotes = noteRepository.findById(id);
        if (optionalNotes.isPresent()) {
            Notes existingNotes = optionalNotes.get();
            existingNotes.setResulat(notes.getResulat());
            
            return ResponseEntity.ok().body(noteRepository.save(existingNotes));
        }
        return ResponseEntity.notFound().build();
    }

    
       
    public ResponseEntity<Object> deleteNotes(Long id) {
        Optional<Notes> optionalNotes = noteRepository.findById(id);
        if (optionalNotes.isPresent()) {
            Notes notes = optionalNotes.get();
            noteRepository.delete(notes);
            return ResponseEntity.ok().body("Notes deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Object> findNotesByName(String name) {
      
        throw new UnsupportedOperationException("Unimplemented method 'findNotesByName'");
    }


}
