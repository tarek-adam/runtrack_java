// runtrack_java/jour02/job10/Job10.java
public class Job10 {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("The sum of the digits is: " + sum);
    }
}
