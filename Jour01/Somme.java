// Somme.java
import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre: ");
        int num1 = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre: ");
        int num2 = scanner.nextInt();
        
        int somme = num1 + num2;
        System.out.println("La somme est: " + somme);
    }
}
