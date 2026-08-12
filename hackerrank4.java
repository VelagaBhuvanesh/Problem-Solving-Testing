import java.util.*;

// Player class as given in the problem
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Comparator implementation for sorting
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First compare by score (descending)
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }
        // If scores are equal, compare by name (ascending)
        return a.name.compareTo(b.name);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int n = scan.nextInt();
            if (n <= 0) {
                System.out.println("Number of players must be positive.");
                return;
            }

            Player[] players = new Player[n];
            for (int i = 0; i < n; i++) {
                String name = scan.next();
                int score = scan.nextInt();
                players[i] = new Player(name, score);
            }

            // Sort using our custom comparator
            Arrays.sort(players, new Checker());

            // Output sorted players
            for (Player p : players) {
                System.out.println(p.name + " " + p.score);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Please enter correct data.");
        } finally {
            scan.close();
        }
    }
}
