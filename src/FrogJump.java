import java.util.Arrays;
public class FrogJump {


    static int solve(int index, int[] height, int[] dp) {

        /* Memoization TC=O(N), SC=O(N) */
//        if (index == 0)
//            return 0;
//        if (dp[index] != -1)
//            return dp[index];
//        int oneJump = solve(index - 1, height, dp) + Math.abs(height[index] - height[index - 1]);
//        int twoJump = Integer.MAX_VALUE;
//        if (index > 1)
//            twoJump = solve(index - 2, height, dp) + Math.abs(height[index] - height[index - 2]);
//        return dp[index] = Math.min(oneJump, twoJump);


        /* Tabulation TC=O(N), SC=O(N) */
//        dp[0]=0;
//        for(index=1;index<height.length;index++){
//            int jumpTwo=Integer.MAX_VALUE;
//            int jumpOne=dp[index-1]+Math.abs(height[index]-height[index-1]);
//            if(index>1)
//                jumpTwo=dp[index-2]+ Math.abs(height[index]-height[index-2]);
//            dp[index]=Math.min(jumpOne,jumpTwo);
//
//        }
//        return dp[height.length-1];


        /* tabulation space optimiztion TC=O(N),SC=O(1) */
        int prev=0;
        int prevTwo=0;

        for(index=1;index<height.length;index++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne=prev+Math.abs(height[index]-height[index-1]);
            if(index>1)
                jumpTwo=prevTwo+ Math.abs(height[index]-height[index-2]);
            int curr=Math.min(jumpOne,jumpTwo);
            prevTwo=prev;
            prev =curr;


        }
        return prev;
    }

    public static void main(String[] args) {

        int n;
        n = 6;
        int[] height = {30, 10, 60, 10, 60, 50};
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(0, height, dp));
    }
}

