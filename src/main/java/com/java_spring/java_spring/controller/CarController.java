package com.java_spring.java_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CarController
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    public CarController(CarRepository carRepository){
        this.carRepository = carRepository;
    }   

    @PostMapping
    @ResponseBody
    public Car create(@RequestBody Car car){
        return this.carRepository.save(car);
    }
    
}