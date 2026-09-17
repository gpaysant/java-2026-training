package Exercises_bonus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercises_oop {

    public static List<Forme> sortAireDesc(List<Forme> formes) {
        formes.sort(Comparator.comparingDouble(Forme::aire).reversed());
        return formes;
    }

    public static void main (String[] args) throws InterruptedException {
        List<Forme> formes = Arrays.asList(
                new Cercle(3),
                new Rectangle(3,3),
                new Triangle(4,3)
        );
        sortAireDesc(formes).forEach(System.out::println);

        Calcul addition = Integer::sum;
        Calcul multiplication = (a,b) -> a * b;

        System.out.println("Addition " + addition.calculer(5,4));
        System.out.println("Multiplication " + multiplication.calculer(5,4));

    }
}
