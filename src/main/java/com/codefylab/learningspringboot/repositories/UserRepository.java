package com.codefylab.learningspringboot.repositories;

import com.codefylab.learningspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
