import java.util.Scanner;
public class FailureCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks;
        int failCount = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks = sc.nextInt();
            if (marks < 40) {
                failCount++;
            }
        }
        System.out.println("Number of failure students: " + failCount);
        sc.close();
    }
}