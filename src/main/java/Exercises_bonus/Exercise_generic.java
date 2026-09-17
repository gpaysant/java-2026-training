package Exercises_bonus;

import java.util.List;
import java.util.NoSuchElementException;

public class Exercise_generic {

    // Implémente une méthode générique <T extends Comparable<T>> T max(List<T> liste) qui retourne le plus grand élément sans utiliser Collections.max.
    public static <T extends Comparable<T>> T max(List<T> liste) {
        if (liste == null || liste.isEmpty()) {
            throw new IllegalArgumentException("La liste ne peut pas être vide ou nulle");
        }
        T max = liste.getFirst();
        for (T t : liste) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
    // return liste.stream().max(Comparable::compareTo).get();

    public static void main (String[] args) {
        List<Integer> nums = List.of(1,4,6,8,10,2);
        System.out.println("Le max de la liste est : " + max(nums));
    }
}
