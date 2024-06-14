// runtrack_java/jour02/job06/Job06.java
public class Job06 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the even numbers is: " + sum);
    }
}
