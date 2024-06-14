// runtrack_java/jour02/job09/Job09.java
public class Job09 {
    public static void main(String[] args) {
        int number = 1234;
        String numberStr = Integer.toString(number);
        
        char firstDigit = numberStr.charAt(0);
        char lastDigit = numberStr.charAt(numberStr.length() - 1);
        
        System.out.println("The first digit is: " + firstDigit);
        System.out.println("The last digit is: " + lastDigit);
    }
}
