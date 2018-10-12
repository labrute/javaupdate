package com.github.labrute.ten.impl;

import com.github.labrute.model.Car;
import com.github.labrute.ten.JavaTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTenImpl implements JavaTen {

    @Override
    public void typeInference() {
        // Java 9
        List<String> lettres = new ArrayList<String>();
        lettres.add("A");
        System.out.println(lettres.getClass() + " " + lettres.get(0).getClass());

        // Java 10
        var voitures = new ArrayList<Car>();
        voitures.add(new Car("Citroën", "C4", 165.0, 100));
        System.out.println(voitures.getClass() + " " + voitures.get(0).getClass());

        var chiffres = Arrays.asList(1, 2, 3);
        System.out.println(chiffres.getClass() + " " + chiffres.get(0).getClass());
    }

    @Override
    public void copyImmutableCollection() {
        var chiffres = new ArrayList<Integer>();
        chiffres.add(1);
        chiffres.add(2);
        chiffres.add(3);
        var copy = List.copyOf(chiffres);
        // Existe aussi pour Map et Set
        System.out.println(chiffres.getClass());
        System.out.println(copy.getClass());
    }
}
