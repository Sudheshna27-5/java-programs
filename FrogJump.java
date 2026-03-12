package models;
import java.util.Scanner;
public class FrogJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] dp = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int jump1 = dp[i-1] + Math.abs(h[i] - h[i-1]);

            int jump2 = Integer.MAX_VALUE;
            if (i > 1) {
                jump2 = dp[i-2] + Math.abs(h[i] - h[i-2]);
            }
            dp[i] = Math.min(jump1, jump2);
        }
        System.out.println("Minimum cost: " + dp[n-1]);
        sc.close();
    }
}