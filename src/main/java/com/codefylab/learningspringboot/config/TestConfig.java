package com.codefylab.learningspringboot.config;

import com.codefylab.learningspringboot.entities.Order;
import com.codefylab.learningspringboot.entities.User;
import com.codefylab.learningspringboot.entities.enums.OrderStatus;
import com.codefylab.learningspringboot.repositories.OrderRepository;
import com.codefylab.learningspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Láiza Kevelly", "laizak@gmail.com", "988888888", "12345678");
        User u2 = new User(null, "Gustavo Santos", "gustavo@gmail.com", "977777777", "12345678");
        User u3 = new User(null, "Pedro Rodrigues", "pedro@gmail.com", "966666666", "12345678");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.CANCELLED, u1);
        Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.CANCELLED, u2);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));

    }
}
