package com.codefylab.learningspringboot.resources;

import com.codefylab.learningspringboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u= new User(1L, "Gustavo", "gustavo@gmail.com", "98898-9898", "golfao234");
        return ResponseEntity.ok().body(u);
    }
}
