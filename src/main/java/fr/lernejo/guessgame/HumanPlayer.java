package fr.lernejo.guessgame;

import fr.lernejo.logger.*;
import java.util.Scanner;

class HumanPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");
    Scanner myObj = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        myObj.nextLine();
        return n;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
    }
}
