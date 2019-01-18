package com.github.labrute.nine.impl;

import com.github.labrute.nine.JavaNine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaNineImpl implements JavaNine {

    @Override
    public void tryWithResources() throws IOException {
        // Java 8
        try (BufferedReader reader1 = new BufferedReader(new StringReader("Message 1")); BufferedReader reader2 = new BufferedReader(new StringReader("Message 2"))) {
            System.out.println(reader1.readLine());
            System.out.println(reader2.readLine());
        }

        // Java 9 : utilisation des reference des objets closable
        BufferedReader reader3 = new BufferedReader(new StringReader("Message 3"));
        BufferedReader reader4 = new BufferedReader(new StringReader("Message 4"));
        try (reader4; reader3) {
            System.out.println(reader3.readLine());
            System.out.println(reader4.readLine());
        }
    }

    /*
     * Fabrique de collection
     */
    @Override
    public void immutableCollections() {
        // Java 8
        List<String> chiffres = new ArrayList<>();
        chiffres.add("1");
        chiffres.add("2");
        chiffres.add("3");
        chiffres.add("4");
        chiffres = Collections.unmodifiableList(chiffres);
        System.out.println(chiffres);
        // ou (mais n'existe pas pour les SET, MAP ...)
        chiffres = Arrays.asList("1", "2", "3", "4");
        System.out.println(chiffres);

        // Java 9
        List<String> chiffresImmutables = List.of("1", "2", "3", "4");
        // Existe aussi pour Map et Set
        System.out.println(chiffresImmutables);
    }

    /**
     * Gestion et controle des process (PID, sous processus ...)
     */
    @Override
    public void processApi() {
        // Java 9 : récupération du process courrant
        System.out.println(ProcessHandle.current());
    }

    /*
     * Gestion de plusieurs release (JAR) en fonction de la version java utilisé sur l'environnement cible
     */
    @Override
    public void multiRelease() {
        // On utilisera une version pour les versions JAVA < 9 et une version différente pour les versions JAVA > 9
        System.out.println("JAR root");
        System.out.println("- Foo.class");
        System.out.println("- Bar.class");
        System.out.println("+ META-INF");
        System.out.println("  - MANIFEST.MF");
        System.out.println("  + versions");
        System.out.println("    + 9");
        System.out.println("      - Bar.class");
    }

    /*
     * Modularisation : Charger seulement les modules necessaires (Trop bien pour l'IoT)
     */
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
