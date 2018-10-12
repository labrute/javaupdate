package com.open.groupe.nine.to.ten;

import com.open.groupe.nine.to.ten.impl.JavaTenImpl;

import java.io.IOException;

public class LauncherNineTen {

    public static void main(String[] args) throws IOException {
        new LauncherNineTen().run();
    }

    private void run() throws IOException {
        JavaTen example = new JavaTenImpl();

        System.out.println(" --- JAVA 10 : 2 Exemples --- ");
        System.in.read();
        System.out.println("# Ex 1 : Inférence");
        example.typeInference();

        System.in.read();
        System.out.println("# Ex 2 : Copie immuable des collections");
        example.copyImmutableCollection();

        // A voir aussi :
        // Amelioration de l'API Optionnal
        // Reader.transferTo(Writer)
        // Parallel Full GC for G1 : Amelioration du garbage collector
        // Thread-Local Handshakes : Plus besoin du safepoint pour la gestion de plusieurs threads
        // Experimental Java-Based JIT Compiler
        // Heap Allocation on Alternative Memory Devices
        // Application Class-Data Sharing : Partage entre JVMs les metas des classes
        // Support de Unicode 8.0.0
        // plus d'info : https://www.azul.com/109-new-features-in-jdk-10
    }
}
