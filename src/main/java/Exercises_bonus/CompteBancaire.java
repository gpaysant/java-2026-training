package Exercises_bonus;

public class CompteBancaire {
    private int money;

    public CompteBancaire (int money) {
        this.money = money;
    }

    public void retirerMoney(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif");
        }
        if (this.money - value < 0) {
            throw new SoldeInsuffisantException();
        }
        this.money = this.money - value;
    }

}
