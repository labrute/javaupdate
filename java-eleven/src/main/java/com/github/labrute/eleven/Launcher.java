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
        // Support de Unicode 10.0.0
        /* ZGC
            Amélioration du garbage collector
            https://www.opsian.com/blog/javas-new-zgc-is-very-exciting/
         */
        /* Chiffement
            ChaCha20 Poly1305 TLS 1.3
            https://openjdk.java.net/jeps/329
         */
        // Suppression module JAVA EE, CORBA
        // Moteur JavaScript Nashorn déprécié
        // pack200, unpack200 dépréciés
        // Dynamic Class-File Constants
        // Toutes les infos http://openjdk.java.net/jeps/0
    }
}
