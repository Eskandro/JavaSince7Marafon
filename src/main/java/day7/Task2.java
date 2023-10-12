package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina = random.nextInt(10) + 91;
        Player player1 = new Player(stamina);
        Player player2 = new Player(stamina);
        Player player3 = new Player(stamina);
        Player player4 = new Player(stamina);
        Player.info();
        Player player5 = new Player(stamina);
        Player player6 = new Player(stamina);
        Player.info();
        player6.run();
        Player.info();
    }
}

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        while (stamina > 0) {
            stamina--;
        }
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}