package com.example.musicapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musicapp")
public class musicController {
    @GetMapping
    public String musicApp(){
        return "This is your music app";
    }
}
