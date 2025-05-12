package com.saunaltech.pilot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("create")
    public String createUser(@RequestBody String username) {
        return "User created with username: " + username;
    }
}
