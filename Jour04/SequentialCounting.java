import java.util.Scanner;

public class SequentialCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number to count: ");
        int maxNumber = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
        
        for (int i = 1; i <= maxNumber; i++) {
            // Simulate some work
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Counted to " + maxNumber);
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }
}
