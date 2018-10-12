package com.github.labrute.eleven;

import com.github.labrute.eleven.impl.JavaElevenImpl;

import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {
        new Launcher().run();
    }

    private void run() throws IOException {
        JavaEleven example = new JavaElevenImpl();

        System.out.println(" --- JAVA 11 : 1 Exemple --- ");
        System.in.read();
        System.out.println("# Ex 1 : Inférence et Lambdas");
        example.inferenceTypeAndLambda();

        // A voir aussi :
        // Nouvelle API HTTP
        // Support de Unicode 10.0.0
        // ZGC amélioration du garbage collector
        // Chiffement ChaCha20 Poly1305 TLS 1.3
        // Suppression module JAVA EE, CORBA
        // moteur JavaScript Nashorn déprécié
        // pack200, unpack200 dépréciés
        // Dynamic Class-File Constants
        // Toutes les infos http://openjdk.java.net/jeps/0
    }
}
