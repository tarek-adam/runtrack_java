import java.util.Arrays;

public class Job08 {
    public static void main(String[] args) {
        int[][] tableau = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};

        // Sort each row
        for (int i = 0; i < tableau.length; i++) {
            Arrays.sort(tableau[i]);
        }

        // Sort columns
        for (int j = 0; j < tableau[0].length; j++) {
            int[] column = new int[tableau.length];
            for (int i = 0; i < tableau.length; i++) {
                column[i] = tableau[i][j];
            }
            Arrays.sort(column);
            for (int i = 0; i < tableau.length; i++) {
                tableau[i][j] = column[i];
            }
        }

        System.out.println("Sorted matrix: ");
        for (int[] row : tableau) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
