import java.util.HashSet;
import java.util.Set;

public class Job05 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 9, 8};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Unique values in the array: ");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }
}
