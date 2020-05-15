package com.java_spring.java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class primeiroController {

    @GetMapping
    public String hello() {

        return "Primeiro exemplo do spring boot.";

    }

    @GetMapping("/subpath")
    public String subPath(){
        return "sub path.";
    }

    @GetMapping("/{dynamic}")
    public String dynamico(@PathVariable("dynamic") String name) {
        return "Nome do parametro " + name;
    }

    
}