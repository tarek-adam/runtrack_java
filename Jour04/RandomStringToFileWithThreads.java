import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringToFileWithThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
        
        String randomString = generateRandomString(length);
        String firstHalf = randomString.substring(0, length / 2);
        String secondHalf = randomString.substring(length / 2);
        
        Thread writer1 = new Thread(() -> writeToFile("output.txt", firstHalf));
        Thread writer2 = new Thread(() -> writeToFile("output.txt", secondHalf));
        
        writer1.start();
        writer2.start();
        
        try {
            writer1.join();
            writer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }

    private static synchronized void writeToFile(String filename, String data) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
