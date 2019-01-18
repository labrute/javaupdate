package com.github.labrute.eight;

import com.github.labrute.eight.impl.JavaEightImpl;
import com.github.labrute.model.Car;

import java.io.IOException;
import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) throws IOException {
        new Launcher().run();
    }

    private void run() throws IOException {
        JavaEight example = new JavaEightImpl();

        System.out.println(" --- Java 8 : 3 Examples --- ");
        System.in.read();
        System.out.println("# Ex 1 : Lambdas and Stream (simple)");
        example.simpleOperation();

        System.in.read();
        System.out.println("# Ex 2 : Lambdas and Stream (complexe)");
        example.complexOperation();

        System.in.read();
        System.out.println("# Ex 3 : Optional");
        Car car1 = new Car("Audi", "A8", 245.3, 286);
        car1.setAllPowers(Arrays.asList(45, 156, 80));
        Car car2 = new Car("Audi", "A8", 245.3, 286);
        Car car3 = null;

        System.out.println(example.getMaxPowerJava7(car1));
        System.out.println(example.getMaxPowerJava7(car2));
        System.out.println(example.getMaxPowerJava7(car3));

        System.out.println(example.getMaxPowerJava8(car1));
        System.out.println(example.getMaxPowerJava8(car2));
        System.out.println(example.getMaxPowerJava8(car3));

        System.in.read();
        System.out.println("# Ex 4 : Methode static et default dans les interfaces");
        System.out.println(JavaEight.takeACar(car1));
        JavaEight.takeACar(car3);

        // #################### A voir aussi ####################
        /* Date Time API :
            Combler les lacunes de java.util.date et calendar
            Plus d'info et d'exemple : https://www.baeldung.com/java-8-date-time-intro
         */
        /* Interfaces fonctionnelles :
            Permet de définir une interface disposant d'une unique méthode abstraite (sans impl)
            Plus d'info et d'exemple : https://blog.ippon.fr/2014/03/18/java-8-interfaces-fonctionnelles/
         */
        /* Annotation de type (@Target, @Encrypted ...)
            But : Renforcer le typage et de ce fait, renforcer les verification à la compil
            Plus d'info et d'exemple : https://dzone.com/articles/java-8-type-annotations
         */
        /* Nashorn (interpréteur JavaScript)
            Digne successeur de Rhino, il est basé sur ECMAScript-262 et implémenté entierement en Java
            Plus d'info et d'exemple : https://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/
         */
        /* Adder, Accumulator
            Arrive en remplacement de Atomic (ex : AtomicLong) en ajoutant les notion de lock-free et thread-safe
            Plus d'info et d'exemple : https://www.baeldung.com/java-longadder-and-longaccumulator
         */
        /* StampedLock
            Support du lock en lecture eciture, corrige les lacunes de ReentrantReadWriteLock
            Plus d'info et d'exemple : https://dzone.com/articles/a-look-at-stampedlock
         */
        /* Parallel Streams
            Permet l'appel en parallèle de méthode lors du traitement d'un stream (ex : appel ascynchrone, utilisation intensive du CPU)
            Plus d'info et d'exemple : https://dzone.com/articles/think-twice-using-java-8
         */
        /* CompletableFuture (
            Souvent utilisé pour le chainage de taches asynch
            Plus d'info et d'exemple : https://www.baeldung.com/java-completablefuture
         */
        // Et bien d'autre : Base 64, Comparator, Read & Write file,
    }
}
