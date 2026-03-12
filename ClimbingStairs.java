package models;
import java.util.Scanner;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Number of ways to climb stairs: " + b);
        sc.close();
    }
}