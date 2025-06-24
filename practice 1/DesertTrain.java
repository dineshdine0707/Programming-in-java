import java.util.*;

class DesertTrain {
    public static int findOptimalPath(char[][] grid, int i, int j, int[][] dp, char prev, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j]=='M') return Integer.MAX_VALUE;
        if (grid[i][j] == 'E') return 0;
        if (dp[i][j] != -1) return dp[i][j];
        
        dp[i][j] = Integer.MAX_VALUE;
        int cost = (prev == 'T' && grid[i][j] == 'T') ? 0 : 1;

        int up = findOptimalPath(grid, i - 1, j, dp, grid[i][j], n);
        int down = findOptimalPath(grid, i + 1, j, dp, grid[i][j], n);
        int left = findOptimalPath(grid, i, j - 1, dp, grid[i][j], n);
        int right = findOptimalPath(grid, i, j + 1, dp, grid[i][j], n);

        dp[i][j] = cost + Math.min(Math.min(up, down), Math.min(left, right));
        return dp[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        sc.close();

        int[][] dp = new int[n][n];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'S') {
                    int result = findOptimalPath(grid, i, j, dp, 'S', n);
                    System.out.println(result == Integer.MAX_VALUE ? -1 : result);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
