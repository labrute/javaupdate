package com.open.groupe.seven.to.eight;

import com.open.groupe.seven.to.eight.impl.JavaEightImpl;
import com.open.groupe.model.Car;

import java.io.IOException;
import java.util.Arrays;

public class LauncherSevenEight {

    public static void main(String[] args) throws IOException {
        new LauncherSevenEight().run();
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

        // A voir aussi :
        // Date Time API
        // Interfaces fonctionnelles
        // Annotation de type (@Target, @Encrypted ...)
        // Nashorn (interpréteur JavaScript)
        // Adder, Accumulator
        // StampedLock
        // Parallel Streams
        // CompletableFuture (Chainage de taches asynch)
        // Et bien d'autre : Base 64, Comparator, Read & Write file,
    }
}
