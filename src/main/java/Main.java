import java.util.List;

public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne("Peter", 35);
        System.out.println(personne);

        List<Livre> livres = List.of(
                new Livre("Le petit prince", "Antoine de Saint Exupery", 1943),
                new Livre("1984", "Georges Orwell", 1951),
                new Livre("Le tour du monde en 80 jours", "Jules verne", 1872)
        );

        livres.forEach(System.out::println);

        Object obj = "Bonjour";
        if (obj instanceof String s) {
            System.out.println(s.length());
        }

        System.out.println(getCategory(livres.getFirst()));
        System.out.println(getCategory(livres.get(1)));
    }

    private static String getCategory (Livre livre) {
        return switch (livre) {
            case Livre(String titre, String auteur, int annee) when annee < 1950 -> "Classique";
            case Livre(String titre, String auteur, int annee) when annee < 2000 -> "Moderne";
            default -> "Récent";
        };
    }
}
