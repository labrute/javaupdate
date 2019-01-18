package com.github.labrute.nine;

import com.github.labrute.nine.impl.JavaNineImpl;

import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {
        new Launcher().run();
    }

    private void run() throws IOException {
        JavaNine example = new JavaNineImpl();

        System.out.println(" --- JAVA 9 : 4 Examples --- ");
        System.in.read();
        System.out.println("# Ex 1 : Création de collection immuable");
        example.immutableCollections();

        System.in.read();
        System.out.println("# Ex 2 : Processus");
        example.processApi();

        System.in.read();
        System.out.println("# Ex 3 : Modularité");
        example.jigsaw();

        System.in.read();
        System.out.println("# Ex 4 : Multi Release");
        example.multiRelease();

        // #################### A voir aussi ####################
        /* REPL jShell (Read, Evaluate, Print, Loop)
            Programmation interactive : Interpretation de l'expression sans etre placée dans une classe ou une methode
            https://blog.soat.fr/2018/03/java9_decouverte_jshell_1/
         */
        /* jLink
            Création d'une JRE customisée pour les perfs, l'IoT, memoire (microservice)
            https://dzone.com/articles/jlink-in-java-9
         */
        /* Amelioration moteur Marlin (Java2D, JavaFX)
            Remplace le moteur Pisces
            https://openjdk.java.net/jeps/265
         */
        /* Stream (nouvelles methodes)
            takeWhile, dropWhile, iterate (ajout de la conditon de fin), ofNullable
            https://www.baeldung.com/java-9-stream-api
         */
        /* Reactive Stream (concurence)
            Gestion des streams ascynchrones
            https://www.baeldung.com/java-9-reactive-streams
         */
        // Chaine de caractères
        // HTTP 2
        // Garbage collector
        // InputStream (nouvelles methodes)
        // VarHandle (accès en écriture et en lecture aux variable)
    }
}
