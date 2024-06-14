import java.util.Random;

public class Job06 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();

        System.out.println("Random array values: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100); // Random integers between 0 and 99
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
