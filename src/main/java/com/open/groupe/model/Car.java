package com.open.groupe.model;

import java.util.List;

public class Car {

    private String model;
    private String brand;
    private Double maxSpeed;
    private Integer horsePower;

    private List<Integer> allPowers;

    public Car( String brand, String model,Double maxSpeed, Integer horsepower) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsepower;
    }

    public String getModel() {
        return model;
    }


    public String getBrand() {
        return brand;
    }


    public Double getMaxSpeed() {
        return maxSpeed;
    }


    public Integer getHorsePower() {
        return horsePower;
    }

    public List<Integer> getAllPowers() {
        return allPowers;
    }

    public void setAllPowers(List<Integer> allPowers) {
        this.allPowers = allPowers;
    }
}
