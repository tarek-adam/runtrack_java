import java.util.HashMap;
import java.util.Map;

public class Job04 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 9, 8};
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int number : numbers) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        System.out.println("Occurrences of each number: ");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
