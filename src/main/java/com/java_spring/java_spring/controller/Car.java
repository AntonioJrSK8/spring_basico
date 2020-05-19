package com.java_spring.java_spring.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Car
 */
@Entity
@Table(name = "cars")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private Integer ano;
    
    @Column
    private String cor;

    public Car(){

    }
    public Car(String name, Integer ano, String cor) {
        this.name = name;
        this.ano = ano;
        this.cor = cor;
    }
    
    public long getId() {
        return this.id;
    }
    
    public String getName() {
        return name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}