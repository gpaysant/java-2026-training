package Exercises_bonus;

public record Cercle(int rayon) implements Forme {
    @Override
    public double aire() {
        return rayon * rayon * Math.PI;
    }
}
