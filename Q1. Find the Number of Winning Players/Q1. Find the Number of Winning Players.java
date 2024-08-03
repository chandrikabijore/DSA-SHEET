import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int winningPlayerCount(int n, int[][] pick) {
        // Array of maps to count the number of balls of each color for each player
        Map<Integer, Integer>[] playerPicks = new HashMap[n];
        for (int i = 0; i < n; i++) {
            playerPicks[i] = new HashMap<>();
        }

        // Count the balls picked by each player
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            playerPicks[player].put(color, playerPicks[player].getOrDefault(color, 0) + 1);
        }

        int winningPlayers = 0;

        // Check which players win
        for (int i = 0; i < n; i++) {
            for (int count : playerPicks[i].values()) {
                if (count > i) {
                    winningPlayers++;
                    break; // No need to check further for this player
                }
            }
        }

        return winningPlayers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 4;
        int[][] pick1 = { {0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0} };
        System.out.println(solution.winningPlayerCount(n1, pick1)); // Output: 2

        int n2 = 5;
        int[][] pick2 = { {1, 1}, {1, 2}, {1, 3}, {1, 4} };
        System.out.println(solution.winningPlayerCount(n2, pick2)); // Output: 0

        int n3 = 5;
        int[][] pick3 = { {1, 1}, {2, 4}, {2, 4}, {2, 4} };
        System.out.println(solution.winningPlayerCount(n3, pick3)); // Output: 1
    }
}
