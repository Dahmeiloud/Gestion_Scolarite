package com.smart.projetsmart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smart.projetsmart.entity.ReleveNote;
import com.smart.projetsmart.repostory.ReleveNoteRepository;

@Service
public class ReleveNoteService {
    
    @Autowired 
    private  ReleveNoteRepository releveNoteRepository;

    public  ResponseEntity<Object> createReleveNote(ReleveNote releveNote) {
        try {
            releveNoteRepository.save(releveNote);
            return ResponseEntity.ok().body("ReleveNote created successfully");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    public  ResponseEntity<ReleveNote> updateReleveNote( ReleveNote releveNote , long id) {
        Optional<ReleveNote> optionalReleveNote = releveNoteRepository.findById(id);
        if (ReleveNote.isPresent()) {
            ReleveNote existingReleveNote = optionalReleveNote.get();


            return ResponseEntity.ok().body(releveNoteRepository.save(existingReleveNote));
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Object> findEtudientByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findEtudientByName'");
    }

   
   
    public ResponseEntity<ReleveNote> updateReleveNote(ReleveNote releveNote) {
       if (releveNote.equals(null))
        throw new UnsupportedOperationException("Unimplemented method 'updateReleveNote'");
             
            return null;
    }

        public ResponseEntity<Object> deleteEtudient(Long id) {
            
            throw new UnsupportedOperationException("Unimplemented method 'deleteEtudient'");
        }

}