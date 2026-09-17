package Exercises_bonus;

public class Exercises_exception {

    public static void main (String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);
        try {
            compte.retirerMoney(1200);
        } catch (SoldeInsuffisantException soldeEx) {
            System.out.println("L'action a échoué, réitérer avec une valeur moins importante");
        }
    }
}
