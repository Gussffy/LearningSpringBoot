package com.codefylab.learningspringboot.config;

import com.codefylab.learningspringboot.entities.User;
import com.codefylab.learningspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Láiza Kevelly", "laizak@gmail.com", "988888888", "12345678");
        User u2 = new User(null, "Gustavo Santos", "gustavo@gmail.com", "977777777", "12345678");
        User u3 = new User(null, "Pedro Rodrigues", "pedro@gmail.com", "966666666", "12345678");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));

    }
}
