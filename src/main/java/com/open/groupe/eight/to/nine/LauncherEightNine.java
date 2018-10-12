package com.open.groupe.eight.to.nine;

import com.open.groupe.eight.to.nine.impl.JavaNineImpl;

import java.io.IOException;

public class LauncherEightNine {

    public static void main(String[] args) throws IOException {
        new LauncherEightNine().run();
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
