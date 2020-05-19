package com.java_spring.java_spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Optional<Car> findById(@PathVariable("id") Long id) {
        return this.carRepository.findById(id);
    }

    @GetMapping
    @ResponseBody
    public List<Car> findAll(){
        return this.carRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public Car create(@RequestBody Car car){
        return this.carRepository.save(car);
    }
    
}