package fr.lernejo.guessgame;

abstract public class Launcher {
    static void main() {
        Player player = new HumanPlayer();
        Simulation simulation = new Simulation(player);
    }
}
