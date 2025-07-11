package com.codefylab.learningspringboot.repositories;

import com.codefylab.learningspringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
