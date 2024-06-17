import java.util.Scanner;

public class ParallelSum {
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
        
        SumThread firstHalf = new SumThread(numbers, 0, size / 2);
        SumThread secondHalf = new SumThread(numbers, size / 2, size);
        
        Thread thread1 = new Thread(firstHalf);
        Thread thread2 = new Thread(secondHalf);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
       
