// UserInput.java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        
        System.out.println("Bonjour, " + prenom + " " + nom);
    }
}
