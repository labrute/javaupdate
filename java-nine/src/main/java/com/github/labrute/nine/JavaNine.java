package com.github.labrute.nine;

import java.io.IOException;

public interface JavaNine {

    void tryWithResources() throws IOException;

    void immutableCollections();

    void processApi();

    void multiRelease();

    void jigsaw();

    void deprecated();

    static void usePrivate() {
        privateInterfaceMethode();
    }

    static void privateInterfaceMethode() {
        System.out.println("Ca ne te regarde pas c'est privé.");
    }

}
