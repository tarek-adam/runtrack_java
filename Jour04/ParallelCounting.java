import java.util.Scanner;

public class ParallelCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number to count: ");
        int maxNumber = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
        
        Thread counter1 = new Thread(() -> countRange(1, maxNumber / 2));
        Thread counter2 = new Thread(() -> countRange(maxNumber / 2 + 1, maxNumber));
        
        counter1.start();
        counter2.start();
        
        try {
            counter1.join();
            counter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Counted to " + maxNumber);
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }

    private static void countRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            // Simulate some work
        }
    }
}
