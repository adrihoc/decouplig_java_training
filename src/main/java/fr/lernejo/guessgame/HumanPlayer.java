package fr.lernejo.guessgame;

import fr.lernejo.logger.*;
import java.util.Scanner;

class HumanPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");
    Scanner myObj = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
