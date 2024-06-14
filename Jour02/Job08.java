// runtrack_java/jour02/job08/Job08.java
import java.util.Scanner;

public class Job08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        scanner.close();
        
        int digitCount = number.length();
        System.out.println("The number of digits in " + number + " is: " + digitCount);
    }
}
