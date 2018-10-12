package com.open.groupe.seven.to.eight.impl;

import com.open.groupe.seven.to.eight.JavaEight;
import com.open.groupe.model.Car;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class JavaEightImpl implements JavaEight {

    private final List<Car> cars = new ArrayList<>();

    public JavaEightImpl() {
        cars.add(new Car("Audi", "A8", 245.3, 286));
        cars.add(new Car("Peugeot", "205", 143.0, 45));
        cars.add(new Car("Ferrari", "F60 America", 340.1, 741));
        cars.add(new Car("Fiat", "Multipla", 178.5, 120));
        cars.add(new Car("Audi", "A8", 250.0, 340));
    }

    // On veut récupérer une liste de propriétés a partir d'une liste de voitures
    @Override
    public void simpleOperation() {
        // Java 7 + Apache
        Collection<Double> speeds = CollectionUtils.collect(cars, new Transformer<Car, Double>() {
            public Double transform(Car car) {
                return car.getMaxSpeed();
            }
        });

        for(Double speed: speeds){
            System.out.println(speed);
        }

        // Java 8 Lambdas + Apache
        // Rappel '::' = reference de méthode
        Collection<Integer> powers = CollectionUtils.collect(cars, Car::getHorsePower);
        powers.forEach(p -> System.out.println(p));

        // Java 8 Lambdas + Stream
        cars.stream().map(Car::getModel).forEach(System.out::println);
    }

    // On veut récupérer une liste de marque / model de voiture sans doublon et trié par ordre alphabetique
    @Override
    public void complexOperation() {
        // Java 7
        Set<String> brands = new HashSet<>();
        for (Car car : cars) {
            brands.add(car.getBrand() + ' ' + car.getModel());
        }
        Collections.sort(new ArrayList<>(brands));
        for(String brand: brands){
            System.out.println(brand);
        }

        // Java 8 Lambdas + Stream
        cars.stream()
                .map(car -> car.getBrand() + ' ' + car.getModel())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    @Override
    public Integer getMaxPowerJava7(Car car){
        Integer pow = 0;
        if(car != null){
            List<Integer> allPowers = car.getAllPowers();
            if(allPowers != null){
                for(Integer p : allPowers){
                    if(p > pow){
                        pow = p;
                    }
                }
            }
        }
        return pow;
    }


    @Override
    public Integer getMaxPowerJava8(Car car){
       return Optional
                .ofNullable(car)
                    .map(Car::getAllPowers)
                    .orElseGet(ArrayList::new)
                        .stream()
                        .max(Integer::compareTo)
                .orElse(0);
    }

}
