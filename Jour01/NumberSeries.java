// NumberSeries.java
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int nombre = scanner.nextInt();
        
        for (int i = 1; i <= nombre; i++) {
            System.out.println(i);
        }
    }
}
