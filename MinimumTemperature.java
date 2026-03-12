package models;
import java.util.Scanner;
public class MinimumTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of temperature readings: ");
        int n = sc.nextInt();
        int[] temps = new int[n];
        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }
        int minTemp = temps[0];
        for (int i = 1; i < n; i++) {
            if (temps[i] < minTemp) {
                minTemp = temps[i];
            }
        }
        System.out.println("Minimum temperature: " + minTemp);
        sc.close();
    }
}