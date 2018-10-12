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

        // A voir aussi :
        // jShell jLink
        // Amelioration moteur marlin (Java2D, JavaFX)
        // Stream (nouvelles methodes)
        // Reactive Stream (concurence)
        // HTTP 2
        // Garbage collector
        // Chaine de caractères
        // InputStream (nouvelles methodes)
        // VarHandle (accès en écriture et en lecture aux variable)
    }
}
