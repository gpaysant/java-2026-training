package Exercises_bonus;

import java.util.concurrent.atomic.AtomicInteger;

public class Game implements Runnable {
    public static AtomicInteger mana = new AtomicInteger(0);

    public void run() {
        System.out.println("This code is running in a thread");
        for (int i = 0; i < 100_000; i++) {
            mana.getAndIncrement(); // AtomicInteger Version
            //incrementCounter(); //Synchronized version
        }

    }

    //Synchronized version
    /*private static synchronized void incrementCounter() {
        mana ++;
    }*/

    public static void main(String[] args) throws InterruptedException {
        Game game1 = new Game();
        Game game2 = new Game();
        game1.run();
        game2.run();
        System.out.println("Résultat (attendu 200000) : " + mana);
    }
}
