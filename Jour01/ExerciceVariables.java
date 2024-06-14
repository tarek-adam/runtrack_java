// ExerciceVariables.java
public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Avant échange : num1 = " + num1 + ", num2 = " + num2);
        
        // Échange des valeurs
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("Après échange : num1 = " + num1 + ", num2 = " + num2);
    }
}
