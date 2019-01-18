package com.github.labrute.ten;

import com.github.labrute.ten.impl.JavaTenImpl;

import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {
        new Launcher().run();
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
        /* Amelioration de l'API Optionnal
            orElseThrow, OptionalInt, OptionalLong, OptionalDouble
         */
        /* Reader.transferTo(Writer)
            Transfer tous les caractères d'un Reader à un Writer
         */
        /* Parallel Full GC for G1
            Amelioration du garbage collector
         */
        /* Thread-Local Handshakes
            Plus besoin du safepoint pour la gestion unitaire de plusieurs threads
            Permet la fermeture d'un thread par exemple
         */
        // Experimental Java-Based JIT Compiler (C++ --> Graal)
        /* Heap Allocation on Alternative Memory Devices (By intel)
            Permet d'utiliser le HEAP qui n'est pas en RAM ==> Perf
         */
        /* Application Class-Data Sharing
            Partage entre JVMs les metas des classes
        */
        // Support de Unicode 8.0.0
        // plus d'info : https://www.azul.com/109-new-features-in-jdk-10
    }
}
