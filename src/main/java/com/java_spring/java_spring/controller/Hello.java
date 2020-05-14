package com.java_spring.java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping
    public String hello() {

        return "Olá mundo.";

    }
}