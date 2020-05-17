package com.java_spring.java_spring.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CarRepository
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    
}