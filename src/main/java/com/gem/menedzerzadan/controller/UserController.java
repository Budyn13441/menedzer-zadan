package com.gem.menedzerzadan.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    @GetMapping("/users")
    public String getUsers() {
        return "Lista uzytkownikow";
    }
}
