public class Job03 {
    public static void main(String[] args) {
        String[] names = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println("Value at index 1: " + names[1]);

        names[2] = "Mireille";
        System.out.println("Modified array values: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
