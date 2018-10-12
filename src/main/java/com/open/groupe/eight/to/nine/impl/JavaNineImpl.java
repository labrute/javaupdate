package com.open.groupe.eight.to.nine.impl;

import com.open.groupe.eight.to.nine.JavaNine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaNineImpl implements JavaNine {

    @Override
    public void tryWithResources() throws IOException {
        // Java 8
        try (BufferedReader reader1 = new BufferedReader(new FileReader("fichier1.txt"))) {
            System.out.println(reader1.readLine());
        }

        // Java 9
        BufferedReader reader2 = new BufferedReader(new FileReader("fichier1.txt"));
        BufferedReader reader3 = new BufferedReader(new FileReader("fichier2.txt"));
        try (reader2; reader3) {
            System.out.println(reader2.readLine());
        }
    }

    @Override
    public void immutableCollections() {
        // Java 8
        List<String> chiffres = Arrays.asList("1", "2", "3", "4");
        chiffres = Collections.unmodifiableList(chiffres);
        System.out.println(chiffres);

        // Java 9
        List<String> chiffresImmutables = List.of("1", "2", "3", "4");
        // Existe aussi pour Map et Set
        System.out.println(chiffresImmutables);
    }

    @Override
    public void processApi() {
        // Java 9 : récupération du process courrant
        System.out.println(ProcessHandle.current());
    }

    @Override
    public void multiRelease() {
        System.out.println("JAR root");
        System.out.println("- Foo.class");
        System.out.println("- Bar.class");
        System.out.println("+ META-INF");
        System.out.println("  - MANIFEST.MF");
        System.out.println("  + versions");
        System.out.println("    + 9");
        System.out.println("      - Bar.class");
    }

    @Override
    public void jigsaw() {
        System.out.println("Modularisation : module-info.java");
        System.out.println("module com.open.groupe {");
        System.out.println("  requires java.sql;");
        System.out.println("  export com.open.groupe.services;");
        System.out.println("}");
    }

    @Override
    @Deprecated(since = "1.8", forRemoval = true)
    public void deprecated() {
        System.out.println("Version de l'ajout du deprecated");
        System.out.println("La méthode risque d'être supprimée");
    }

}
