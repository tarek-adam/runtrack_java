public class Job02 {
    public static void main(String[] args) {
        int[] monTableau = {12, 6, 76, 89};
        System.out.println("Original array values: ");
        for (int i : monTableau) {
            System.out.print(i + " ");
        }

        monTableau[0] = 21;
        monTableau[1] = 16;
        monTableau[2] = 67;
        monTableau[3] = 98;

        System.out.println("\nModified array values: ");
        for (int i : monTableau) {
            System.out.print(i + " ");
        }
    }
}
