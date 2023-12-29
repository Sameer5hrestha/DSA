import java.util.Arrays;
import java.util.Scanner;
public class FrogJump {

    static int solve(int index, int[] height, int[] dp) {
        if (index == 0)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int oneJump = solve(index - 1, height, dp) + Math.abs(height[index] - height[index - 1]);
        int twoJump = Integer.MAX_VALUE;
        if (index > 1)
            twoJump = solve(index - 2, height, dp) + Math.abs(height[index] - height[index - 2]);
        return dp[index] = Math.min(oneJump, twoJump);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] height = {30, 10, 60, 10, 60, 50};
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(n - 1, height, dp));
    }
}

