public record Livre(String titre, String auteur, int annee){

    @Override
    public String toString() {
        return "Titre du livre : '" + titre + "' écrit par " + auteur + " en " + annee;
    }

    public String getCategory () {
        return switch (this) {
            case Livre(String titre, String auteur, int annee) when annee < 1950 -> "Classique";
            case Livre(String titre, String auteur, int annee) when annee < 2000 -> "Moderne";
            default -> "Récent";
        };
    }
}
