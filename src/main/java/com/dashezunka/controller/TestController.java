package com.dashezunka.controller;

import com.dashezunka.domain.User;
import com.dashezunka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/new")
    public ResponseEntity<User> test(){
        User user = new User();
        user.setUsername("Test");
        user.setPassword("1234");
        user = userRepository.save(user);
        return ResponseEntity.ok(user);
    }

}
