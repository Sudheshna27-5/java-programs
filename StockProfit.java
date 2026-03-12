package models;
import java.util.Scanner;
public class StockProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int minPrice = price[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            int profit = price[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println("Maximum Profit: " + maxProfit);
        sc.close();
    }
}