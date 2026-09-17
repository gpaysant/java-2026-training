package Exercises_bonus;

public record Rectangle(int largeur, int longueur) implements Forme {
    @Override
    public double aire() {
        return largeur * longueur;
    }
}
