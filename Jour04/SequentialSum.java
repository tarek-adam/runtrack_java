import java.util.Scanner;

public class SequentialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        long startTime = System.currentTimeMillis();
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }
}
