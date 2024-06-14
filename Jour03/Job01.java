public class Job01 {
    public static void main(String[] args) {
        int[] tableau = new int[5];
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        System.out.println("Array values: ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println("\nValue at index 1: " + tableau[1]);
    }
}
