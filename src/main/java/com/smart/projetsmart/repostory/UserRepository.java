package com.smart.projetsmart.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.projetsmart.entity.UserApp;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserApp, Integer> {
    Optional<UserApp> findByUsername(String username);
    List<UserApp> findByUsernameContains(String username);
    Optional<UserApp> findByEmail(String email);
}
