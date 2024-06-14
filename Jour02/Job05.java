// runtrack_java/jour02/job05/Job05.java
import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 16) {
            System.out.println("You cannot work.");
        } else if (age > 55) {
            if (age == 67) {
                System.out.println("You are retired.");
            } else {
                System.out.println("You may have difficulty finding a job.");
            }
        } else {
            System.out.println("You can work.");
        }
        
        scanner.close();
    }
}
