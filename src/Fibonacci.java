import java.util.Scanner;

public class Fibonacci {
        static int fibo(int n){
            int [] dp =new int[n+1];
            /* memoization TC=O(N),SC=O(N)*/
//        if(n<=1){
//            return n;
//        }
//        if(dp[n]!=-0)
//            return dp[n];
//        return dp[n]=fibo(n-1)+fibo(n-2);

            /* tabulation TC=O(N),SC=O(N) */
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<=n;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];

            /* tabulation space optimiztion TC=O(N),SC=O(1) */
            int prev=1;
            int prev2=0;
            for(int i=2;i<=n;i++){
                int curr=prev+prev2;
                prev2=prev;
                prev=curr;
            }
            return prev;
        }
        public static void main(String[] args) {
            int n;
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
            System.out.println(fibo(n));
        }
    }

