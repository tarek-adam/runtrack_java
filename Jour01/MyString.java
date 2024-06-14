// MyString.java
public class MyString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello" + " World";
        String str4 = String.format("Hello %s", "World");
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
