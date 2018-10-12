package com.open.groupe.ten.to.eleven.impl;

import com.open.groupe.ten.to.eleven.JavaEleven;

import java.util.List;

public class JavaElevenImpl implements JavaEleven {

    @Override
    public void inferenceTypeAndLambda() {
        // Java 10
        var mots = List.of("Hypnotiser", "Oasis", "Bruyant", "Quinze", "Etriers", "Couche");
        mots.stream().filter((String s) -> s.contains("e")).forEach(System.out::println);

        // Java 11
        mots.stream().filter((var s) -> s.contains("e")).forEach(System.out::println);
    }
}
