package com.open.groupe.eight.to.nine;

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

    private static void privateInterfaceMethode() {
        System.out.println("Ca ne te regarde pas c'est privé.");
    }

}
