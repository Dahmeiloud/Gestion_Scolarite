package com.smart.projetsmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.smart.projetsmart.entity.Notes;

import com.smart.projetsmart.service.NoteService;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/notes")
public class NotesController {
    
    @Autowired
    private NoteService service;

    @PostMapping("/create")
    public ResponseEntity<Object> createNote(@RequestBody Notes notes) {
        return service.createNotes(notes);
    } 

    @PutMapping("/update/{id}")
    public ResponseEntity<Notes> updateNotes(@PathVariable Long id, @RequestBody Notes notes) {
        return service.updateN( notes , id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteNotes(@PathVariable Long id){
        return service.deleteNotes(id);
    }

    @GetMapping("/name")
    public ResponseEntity<Object> findNotesByName(@RequestParam String name){
        return service.findNotesByName(name);
 
    }
}
