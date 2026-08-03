public record Livre(String titre, String auteur, int annee){

    @Override
    public String toString() {
        return "Titre du livre : '" + titre + "' écrit par " + auteur + " en " + annee;
    }
}
