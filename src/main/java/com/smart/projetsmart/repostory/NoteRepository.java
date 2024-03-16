package com.smart.projetsmart.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.projetsmart.entity.Notes;

public interface NoteRepository  extends JpaRepository <Notes, Long> {
        Notes findByResulat(String Resulat);

}
