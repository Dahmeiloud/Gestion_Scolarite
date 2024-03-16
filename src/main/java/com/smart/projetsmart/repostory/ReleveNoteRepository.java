package com.smart.projetsmart.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.projetsmart.entity.ReleveNote;

public interface ReleveNoteRepository extends JpaRepository<ReleveNote, Long>{

            // ReleveNote findByName(String name);

    
}
