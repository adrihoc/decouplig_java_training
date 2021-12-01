package fr.lernejo.guessgame;

import fr.lernejo.logger.*;
import java.security.SecureRandom;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player = null;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        SecureRandom random = new SecureRandom();
        initialize(random.nextInt(100));
        loopUntilPlayerSucceed();

    }

    public void initialize(long numberToGuess) {

    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        System.out.println("Enter a number:");

        long n = player.askNextGuess();
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
        do {
            nextRound();
        } while (nextRound());
    }
}
