public class Solution {
    
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Calculate flips needed to make all rows palindromic
        int rowFlips = 0;
        for (int i = 0; i < m; i++) {
            rowFlips += minFlipsToMakePalindrome(grid[i]);
        }

        // Calculate flips needed to make all columns palindromic
        int colFlips = 0;
        for (int j = 0; j < n; j++) {
            int[] col = new int[m];
            for (int i = 0; i < m; i++) {
                col[i] = grid[i][j];
            }
            colFlips += minFlipsToMakePalindrome(col);
        }

        // Return the minimum of rowFlips and colFlips
        return Math.min(rowFlips, colFlips);
    }

    private int minFlipsToMakePalindrome(int[] arr) {
        int flips = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                flips++;
            }
            left++;
            right--;
        }
        return flips;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] grid1 = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        System.out.println(solution.minFlips(grid1)); // Output: 2
        
        int[][] grid2 = {
            {0, 1},
            {0, 1},
            {0, 0}
        };
        System.out.println(solution.minFlips(grid2)); // Output: 1
        
        int[][] grid3 = {
            {1},
            {0}
        };
        System.out.println(solution.minFlips(grid3)); // Output: 0
    }
}
