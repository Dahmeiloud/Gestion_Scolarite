package com.smart.projetsmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.projetsmart.entity.ReleveNote;
import com.smart.projetsmart.service.ReleveNoteService;

@RestController
@RequestMapping("/relevenotes")
public class ReleveNoteController {
    
        @Autowired
    private ReleveNoteService service;

    @PostMapping("/create")
    public ResponseEntity<Object> createReleveNote(@RequestBody ReleveNote releveNote) {
        return service.createReleveNote(releveNote);
    } 

    @PutMapping("/update/{id}")
    public ResponseEntity<ReleveNote> updateReleveNote(@PathVariable Long id, @RequestBody ReleveNote releveNote) {
        return service.updateReleveNote( releveNote);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteEtudient(@PathVariable Long id){
            return service.deleteEtudient(id);
    }

    // @GetMapping("/name")
    // public ResponseEntity<Object> findEtudientByName(@RequestParam String name){
    //     return service.findEtudientByName(name);
    // }

    
}
