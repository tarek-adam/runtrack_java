// TimeConverter.java
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le temps en minutes: ");
        int minutes = scanner.nextInt();
        
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        
        System.out.printf("%02d:%02d\n", hours, remainingMinutes);
    }
}
