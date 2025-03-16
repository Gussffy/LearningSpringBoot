package com.codefylab.learningspringboot.repositories;

import com.codefylab.learningspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
