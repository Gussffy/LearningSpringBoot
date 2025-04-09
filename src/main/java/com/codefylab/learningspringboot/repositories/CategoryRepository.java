package com.codefylab.learningspringboot.repositories;

import com.codefylab.learningspringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
