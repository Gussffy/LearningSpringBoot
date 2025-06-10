package com.codefylab.learningspringboot.repositories;

import com.codefylab.learningspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
