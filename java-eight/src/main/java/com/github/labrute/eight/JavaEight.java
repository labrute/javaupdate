package com.github.labrute.eight;


import com.github.labrute.model.Car;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * Arrivé de Java 8 : Mars 2014
 */
public interface JavaEight {

    void simpleOperation();

    void complexOperation();

    Integer getMaxPowerJava7(Car car);

    Integer getMaxPowerJava8(Car car);

    static String takeACar(Car car) {
        Objects.requireNonNull(car, () -> "Null c'est nul");
        return new StringJoiner(" - ", "Vous allez conduire une ", " soyez prudent !").add(car.getBrand()).add(car.getModel()).toString();
    }

    default String getCarName(Car car) {
        return car.getBrand() + " " + car.getModel();
    }
}
