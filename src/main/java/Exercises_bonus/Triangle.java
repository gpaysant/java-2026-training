package Exercises_bonus;

public record Triangle(int base, int hauteur) implements Forme {

    @Override
    public double aire() {
        return base * hauteur;
    }
}
