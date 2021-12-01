package fr.lernejo.guessgame;

import fr.lernejo.logger.*;
import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player = null;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
    }

    public void initialize(long numberToGuess) {
        numberToGuess = 20;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        System.out.println("Enter a number:");
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        myObj.nextLine();

        if (n > numberToGuess) {
        }
        else if (n < numberToGuess) {
            System.out.println("Greater.");
        }
        else {
            System.out.println("Guessed.");
            return true;
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        while (nextRound()) {
            nextRound();
        }
    }
}
