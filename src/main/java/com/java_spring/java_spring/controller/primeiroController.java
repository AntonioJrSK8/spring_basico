package com.java_spring.java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

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

    // http://localhost:8080/subpath?name=Pedro
    @GetMapping("/subpath2")
    @ResponseBody
    public String subPathQueryString(@RequestParam(value = "name", required = false) String name) {
        return "Valor de uma Query String: " + name;
    }

    @GetMapping("/subpath3")
    public String subPathWebRequest(final WebRequest webRequest) {
        String name = webRequest.getParameter("namefull");
        return "Valor de uma Query String: " + name;
    }

    @GetMapping("/{dynamic}")
    public String dynamico(@PathVariable("dynamic") String name) {
        return "Nome do parametro: " + name;
    }


}