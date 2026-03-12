package models;
import java.util.Scanner;
public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();
        int[] money = new int[n];
        int[] dp = new int[n];
        System.out.println("Enter money in each house:");
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }
        dp[0] = money[0];
        if (n > 1) {
            dp[1] = Math.max(money[0], money[1]);
        }
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + money[i]);
        }
        System.out.println("Maximum money robbed: " + dp[n-1]);
        sc.close();
    }
}