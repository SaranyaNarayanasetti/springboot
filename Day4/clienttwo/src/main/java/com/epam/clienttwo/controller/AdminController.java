package com.epam.clienttwo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @GetMapping("/home")
    public ResponseEntity<String> home(){

        System.out.println("entering home in client-one");
        return ResponseEntity.ok("Welcome Admin");
    }
}

