import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Exercises_bonus.Exercise_generic;
import org.owasp.encoder.Encode;

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
        System.out.println(livres.getFirst().getCategory());
        System.out.println(livres.get(1).getCategory());

        //Stream
        Map<String, Long> nbBooksByCategory = livres.stream().collect(Collectors.groupingBy(Livre::getCategory, Collectors.counting()));
        System.out.println("Categories : ");
        nbBooksByCategory.forEach((k,v) -> {
                System.out.printf("%s -> %d \n", k,v);
            }
        );

        //Text Block
        String htmlBooks = livres.stream()
                .map(livre -> """
                        <tr>
                            <td> %s </td>
                            <td> %s </td>
                            <td> %d </td>
                        </tr>
                    """.formatted(
                            Encode.forHtml(livre.titre()), // to avoid xss attack
                            Encode.forHtml(livre.auteur()), // to avoid xss attack
                            livre.annee())
                        )
                .collect(Collectors.joining("",
                """
                       <table>
                          <tr>
                              <th>Titre</th>
                              <th>Auteur</th>
                              <th>Annee</th>
                          </tr>
                      """,
                "</table>"));
        System.out.println(htmlBooks);

        // Max of list
        List<String> names = List.of( "Rambo", "Rocky", "Peter");
        System.out.println("max is " + Exercise_generic.max(names));;
    }
}
