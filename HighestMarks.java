package models;
import java.util.Scanner;
public class HighestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks;
        int highest = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks = sc.nextInt();
            if (marks > highest) {
                highest = marks;
            }
        }
        System.out.println("Highest marks in the class: " + highest);
        sc.close();
    }
}